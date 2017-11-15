package me.geemu.exception;

import lombok.Getter;
import me.geemu.enumerate.BaseResponseEnum;

import java.io.Serializable;

/**
 * 自定义异常
 */

public class BusinessException extends RuntimeException implements Serializable {

    private static final long serialVersionUID = -3383376962482867983L;

    @Getter
    private Integer code;

    @Getter
    private String message;

    public BusinessException() {
    }

    public BusinessException(String message) {
        this.code = BaseResponseEnum.DEFAULT_BUSINESS_ERROR.getCode();
        this.message = message;
    }

    public BusinessException(BaseResponseEnum baseResponseEnum) {
        this.code = baseResponseEnum.getCode();
        this.message = baseResponseEnum.getMessage();
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }


}
