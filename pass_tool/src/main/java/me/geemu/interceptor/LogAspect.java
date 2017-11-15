package me.geemu.interceptor;


import com.alibaba.fastjson.JSON;
import me.geemu.domain.BaseResponse;
import me.geemu.enumerate.BaseResponseEnum;
import me.geemu.exception.BusinessException;
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

    // 这边只能记录正常的日志，如果抛出异常则需要到底层记录
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
        BaseResponse<Object> response = new BaseResponse<Object>();
        StringBuilder logSb = new StringBuilder("\r\n");
        logSb.append(String.format("[TargetMethod]\t%s\r\n", targetMethod));
        logSb.append(String.format("[RequestParams]\t%s\r\n", JSON.toJSONString(requestParams)));
        logSb.append(String.format("[ResponseBody]\t%s\r\n", JSON.toJSONString(response)));
        logSb.append(String.format("[RequestURL]\t%s\r\n", attributes.getRequest().getRequestURL()));
        if (e instanceof BusinessException) {
            BusinessException be = (BusinessException) e;
            response.setCode(BaseResponseEnum.DEFAULT_BUSINESS_ERROR.getCode());
            response.setMessage(be.getMessage());
            if (be.getCode() != null) {
                response.setCode(be.getCode());
            }
            logger.error(String.format("[发生了自定义异常]\t%s\r", logSb.toString()));
        } else {
            response.setCode(BaseResponseEnum.DEFAULT_UNKNOW_ERROR.getCode());
            response.setMessage(BaseResponseEnum.DEFAULT_UNKNOW_ERROR.getMessage());
            logger.error(String.format("[后台未知异常，请联系开发小哥]\t%s\r", logSb.toString()));
        }

    }
}
