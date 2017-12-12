package me.geemu.exception;

import me.geemu.util.ErrorResponse;
import me.geemu.enums.ResponseEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
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
     * 未授权 要求验证 登陆失败
     * 状态码改为401
     *
     * @param ue
     * @return
     */
    @ExceptionHandler(UnAuthorizedException.class)
    @ResponseStatus(value = HttpStatus.UNAUTHORIZED)
    public Object handleCustomException(UnAuthorizedException ue) {
        ErrorResponse response = new ErrorResponse();
        response.setCode(ue.getCode());
        response.setMessage(ue.getMessage());
        return response;
    }


    /**
     * 禁止 Forbidden 权限不够，参数校验失败等
     * 状态码改为403
     *
     * @param fb
     * @return
     */
    @ExceptionHandler(ForbiddenException.class)
    @ResponseStatus(value = HttpStatus.FORBIDDEN)
    public Object handleForbiddenException(ForbiddenException fb) {
        ErrorResponse response = new ErrorResponse();
        response.setCode(fb.getCode());
        response.setMessage(fb.getMessage());
        return response;
    }

    /**
     * 资源未找到
     * 状态码改为404
     *
     * @param ne
     * @return
     */
    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public Object handleCustomException(NotFoundException ne) {
        ErrorResponse response = new ErrorResponse();
        response.setCode(ne.getCode());
        response.setMessage(ne.getMessage());
        return response;
    }


    /**
     * 未知异常
     * 状态码改为500
     *
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public Object handleAllException(Exception e) {
        logger.error("[后台未知异常，请联系开发小哥]", e);
        ErrorResponse response = new ErrorResponse();
        response.setCode(ResponseEnum.INTERNAL_SERVER_ERROR.getCode());
        response.setMessage(ResponseEnum.INTERNAL_SERVER_ERROR.getMessage());
        return response;
    }
}
