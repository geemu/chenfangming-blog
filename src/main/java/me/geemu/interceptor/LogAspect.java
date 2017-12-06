package me.geemu.interceptor;

import com.alibaba.fastjson.JSON;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


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
        Object[] requestParams = point.getArgs();
        Object response = null;
        response = point.proceed();
        logSb.append(String.format("[TargetMethod]\t%s\r\n", targetMethod));
        logSb.append(String.format("[RequestParams]\t\t%s\r\n", JSON.toJSONString(requestParams)));
        logSb.append(String.format("[ResponseBody]\t%s\r\n", JSON.toJSONString(response)));
        logger.info(logSb.toString());
        return response;
    }

    @AfterThrowing(pointcut = "pointcut()", throwing = "e")
    public void errorMsg(JoinPoint point, Exception e) {
        String targetMethod = point.getSignature().getDeclaringTypeName() + "." + point.getSignature().getName();
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        Object[] requestParams = point.getArgs();
        Object response = new Object();
        StringBuilder logSb = new StringBuilder("\r\n");
        logSb.append(String.format("[RequestURL]\t%s\r\n", attributes.getRequest().getRequestURL()));
        logSb.append(String.format("[RequestParams]\t%s\r\n", JSON.toJSONString(requestParams)));
        logSb.append(String.format("[TargetMethod]\t%s\r\n", targetMethod));
        logSb.append(String.format("[ResponseBody]\t%s\r\n", JSON.toJSONString(response)));
        logger.error(logSb.toString(), e);
    }
}
