package me.geemu.exception;

import lombok.Data;
import me.geemu.enums.ResponseEnum;

import java.io.Serializable;

/**
 * @Author: Geemu
 * Email:cfmmail@sina.com
 * Date: 2017/12/5 17:56
 * Description: 未授权
 */
@Data
public class UnAuthorizedException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = -3383376962482867986L;

    private Integer code;

    private String message;

    public UnAuthorizedException(ResponseEnum responseEnum) {
        this.code = responseEnum.getCode();
        this.message = responseEnum.getMessage();
    }
}
