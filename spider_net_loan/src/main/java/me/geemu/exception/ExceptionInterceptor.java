package me.geemu.exception;

import me.geemu.domain.BaseResponse;
import me.geemu.enumerate.BaseResponseEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常拦截器
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
    public BaseResponse<Object> handleCustomException(BusinessException be) {
        BaseResponse<Object> response = new BaseResponse<Object>();
        response.setCode(BaseResponseEnum.DEFAULT_BUSINESS_ERROR.getCode());
        response.setMessage(be.getMessage());
        if (be.getCode() != null) {
            response.setCode(be.getCode());
        }
        return response;
    }

    /**
     * 其他异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    public BaseResponse<Object> handleAllException(Exception e) {
        logger.error("[后台未知异常，请联系开发小哥]", e);
        BaseResponse<Object> response = new BaseResponse<Object>();
        response.setCode(BaseResponseEnum.DEFAULT_UNKNOW_ERROR.getCode());
        response.setMessage(BaseResponseEnum.DEFAULT_UNKNOW_ERROR.getMessage());
        return response;
    }
}
