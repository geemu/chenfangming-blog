package com.chenfangming.exception;

import com.chenfangming.enums.ResponseEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Geemu
 * Email:cfmmail@sina.com
 * Date: 2017/12/5 13:42
 * Description: Business 业务异常
 */
@Data
public class BusinessException extends RuntimeException implements Serializable {

    private static final long serialVersionUID = -3383376962482867983L;

    private Integer code;

    private String message;

    public BusinessException(ResponseEnum responseEnum) {
        this.code = responseEnum.getCode();
        this.message = responseEnum.getMessage();
    }

    public BusinessException(String message) {
        this.message = message;
    }

}
