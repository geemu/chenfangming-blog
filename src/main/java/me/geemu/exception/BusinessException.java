package me.geemu.exception;

import lombok.Getter;
import me.geemu.enums.ResponseStatus;

/**
 * @Author: Geemu
 * Email:cfmmail@sina.com
 * Date: 2017/12/5 13:42
 * Description:
 */
public class BusinessException extends RuntimeException {

    @Getter
    private Integer code;

    @Getter
    private String message;

    public BusinessException(ResponseStatus responseStatus) {
        this.code = responseStatus.getCode();
        this.message = responseStatus.getMessage();
    }

}
