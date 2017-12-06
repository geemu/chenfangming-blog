package me.geemu.exception;

import lombok.Data;
import me.geemu.enums.ResponseEnum;

import java.io.Serializable;

/**
 * @Author: Geemu
 * Email:cfmmail@sina.com
 * Date: 2017/12/5 13:42
 * Description: FORBIDDEN
 */
@Data
public class ForbiddenException extends RuntimeException implements Serializable {

    private static final long serialVersionUID = -3383376962482867983L;

    private Integer code;

    private String message;

    public ForbiddenException(ResponseEnum responseEnum) {
        this.code = responseEnum.getCode();
        this.message = responseEnum.getMessage();
    }

}
