package com.chenfangming.exception;

import com.chenfangming.enums.ResponseEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Geemu
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

    public NotFoundException(String message) {
        this.message = message;
    }

}
