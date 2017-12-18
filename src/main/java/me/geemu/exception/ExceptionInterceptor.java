package me.geemu.exception;

import me.geemu.domain.ErrorResponse;
import me.geemu.enums.ResponseEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Geemu
 * Email:cfmmail@sina.com
 * Date: 2017/12/5 10:38
 * Description: 全局异常拦截器
 */
@RestControllerAdvice
public class ExceptionInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(ExceptionInterceptor.class);

    /**
     * @param ue 未授权 要求验证 登陆失败 状态码改为401
     * @return 返回包装后的异常信息
     */
    @ExceptionHandler(UnAuthorizedException.class)
    @ResponseStatus(value = HttpStatus.UNAUTHORIZED)
    public Object handleCustomException(UnAuthorizedException ue) {
        return new ErrorResponse(ue.getCode(), ue.getMessage());
    }


    /**
     * @param ne 资源未找到 状态码改为404
     * @return 返回包装后的异常信息
     */
    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public Object handleCustomException(NotFoundException ne) {
        return new ErrorResponse(ne.getCode(), ne.getMessage());
    }

    /**
     * @param be 业务异常 参数校验不通过等
     * @return 返回包装后的异常信息
     */
    @ExceptionHandler(BusinessException.class)
    @ResponseStatus(value = HttpStatus.FORBIDDEN)
    public Object handleForbiddenException(BusinessException be) {
        return new ErrorResponse(be.getCode(), be.getMessage());
    }

    /**
     * @param e 未知异常 状态码改为500
     * @return 返回包装后的异常信息
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public Object handleAllException(Exception e) {
        logger.error("[后台未知异常，请联系开发小哥]", e);
        return new ErrorResponse(ResponseEnum.DEFAULT_INTERNAL_SERVER_ERROR.getCode(), ResponseEnum.DEFAULT_INTERNAL_SERVER_ERROR.getMessage());
    }
}
