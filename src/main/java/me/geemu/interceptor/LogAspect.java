package me.geemu.interceptor;

import com.alibaba.fastjson.JSON;

import me.geemu.domain.ErrorResponse;
import me.geemu.exception.BusinessException;
import me.geemu.exception.NotFoundException;
import me.geemu.exception.UnAuthorizedException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
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


    @Pointcut("execution(* me.geemu.controller..*(..))")
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
            response.setCode(HttpStatus.UNAUTHORIZED.value());
        } else if (e instanceof NotFoundException) {
            response.setCode(HttpStatus.NOT_FOUND.value());
        } else if (e instanceof BusinessException) {
            response.setCode(HttpStatus.BAD_REQUEST.value());
        } else {
            response.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        }
        logSb.append(String.format("[ResponseBody]\t%s\r\n", JSON.toJSONString(response)));
        if (e instanceof UnAuthorizedException || e instanceof BusinessException || e instanceof NotFoundException) {
            logger.warn(logSb.toString(), e);
        } else {
            logger.error(logSb.toString(), e);
        }
    }

}
