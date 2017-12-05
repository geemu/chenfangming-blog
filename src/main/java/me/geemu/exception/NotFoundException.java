package me.geemu.exception;

import lombok.Data;
import me.geemu.enums.ResponseEnum;

import java.io.Serializable;

/**
 * @Author: Geemu
 * Email:cfmmail@sina.com
 * Date: 2017/12/5 17:54
 * Description: 资源未找到
 */
@Data
public class NotFoundException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = -3383376962482867913L;

    private Integer code;

    private String message;

    public NotFoundException(ResponseEnum responseEnum) {
        this.code = responseEnum.getCode();
        this.message = responseEnum.getMessage();
    }
}
