package com.chenfangming.interceptor;

import com.alibaba.fastjson.JSON;
import com.chenfangming.domain.ErrorResponse;
import com.chenfangming.exception.BusinessException;
import com.chenfangming.exception.NotFoundException;
import com.chenfangming.exception.UnAuthorizedException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * @Author: Geemu
 * Email:cfmmail@sina.com
 * Date: 2017/12/5 10:38
 * Description:
 */
@Aspect
@Component
public class LogAspect {
    private static Logger logger = LoggerFactory.getLogger(LogAspect.class);


    @Pointcut("execution(* com.chenfangming.controller..*(..))")
    public void pointcut() {

    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        StringBuilder logSb = new StringBuilder("\r\n");
        String targetMethod = point.getSignature().getDeclaringTypeName() + "." + point.getSignature().getName();
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        Object[] requestParams = point.getArgs();
        Object response = point.proceed();
        logSb.append(String.format("[RequestURL]\t%s\r\n", attributes.getRequest().getRequestURL()));
        logSb.append(String.format("[RequestParams]\t%s\r\n", JSON.toJSONString(requestParams)));
        logSb.append(String.format("[TargetMethod]\t%s\r\n", targetMethod));
        logSb.append(String.format("[ResponseCode]\t%s\r\n", attributes.getResponse().getStatus()));
        logSb.append(String.format("[ResponseBody]\t%s\r\n", JSON.toJSONString(response)));
        logger.info(logSb.toString());
        return response;
    }

    @AfterThrowing(pointcut = "pointcut()", throwing = "e")
    public void errorMsg(JoinPoint point, Exception e) {
        String targetMethod = point.getSignature().getDeclaringTypeName() + "." + point.getSignature().getName();
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        Object[] requestParams = point.getArgs();
        StringBuilder logSb = new StringBuilder("\r\n");
        logSb.append(String.format("[RequestURL]\t%s\r\n", attributes.getRequest().getRequestURL()));
        logSb.append(String.format("[RequestParams]\t%s\r\n", JSON.toJSONString(requestParams)));
        logSb.append(String.format("[TargetMethod]\t%s\r\n", targetMethod));
        ErrorResponse response = new ErrorResponse();
        response.setMessage(e.getMessage());
        if (e instanceof UnAuthorizedException) {
            attributes.getResponse().setStatus(HttpStatus.UNAUTHORIZED.value());
            response.setCode(HttpStatus.UNAUTHORIZED.value());
        } else if (e instanceof NotFoundException) {
            attributes.getResponse().setStatus(HttpStatus.NOT_FOUND.value());
            response.setCode(HttpStatus.NOT_FOUND.value());
        } else if (e instanceof BusinessException) {
            attributes.getResponse().setStatus(HttpStatus.BAD_REQUEST.value());
            response.setCode(HttpStatus.BAD_REQUEST.value());
        } else {
            attributes.getResponse().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            response.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
            response.setMessage(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
        }
        logSb.append(String.format("[ResponseCode]\t%s\r\n", attributes.getResponse().getStatus()));
        logSb.append(String.format("[ResponseBody]\t%s\r\n", JSON.toJSONString(response)));
        if (e instanceof UnAuthorizedException || e instanceof BusinessException || e instanceof NotFoundException) {
            logger.warn(logSb.toString(), e);
        } else {
            logger.error(logSb.toString(), e);
        }
    }

}
