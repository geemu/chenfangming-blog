package me.geemu.exception;

import me.geemu.domain.response.ErrorResponse;
import me.geemu.enums.ResponseStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author: Geemu
 * Email:cfmmail@sina.com
 * Date: 2017/12/5 10:38
 * Description: 全局异常拦截器
 */
@RestControllerAdvice
public class ExceptionInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(ExceptionInterceptor.class);

    /**
     * 自定义异常
     *
     * @param be
     * @return
     */
    @ExceptionHandler(BusinessException.class)
    public Object handleCustomException(BusinessException be) {
        ErrorResponse response = new ErrorResponse();
        response.setCode(be.getCode());
        response.setMessage(be.getMessage());
        return response;
    }

    /**
     * 其他异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    public Object handleAllException(Exception e) {
        logger.error("[后台未知异常，请联系开发小哥]", e);
        ErrorResponse response = new ErrorResponse();
        response.setCode(ResponseStatus.INTERNAL_SERVER_ERROR.getCode());
        response.setMessage(ResponseStatus.INTERNAL_SERVER_ERROR.getMessage());
        return response;
    }
}
