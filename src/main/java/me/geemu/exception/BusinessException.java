package me.geemu.exception;

import lombok.Data;
import lombok.Getter;
import me.geemu.enums.ResponseStatus;

import java.io.Serializable;

/**
 * @Author: Geemu
 * Email:cfmmail@sina.com
 * Date: 2017/12/5 13:42
 * Description:
 */
@Data
public class BusinessException extends RuntimeException implements Serializable {

    private static final long serialVersionUID = -3383376962482867983L;

    private Integer code;

    private String message;

    public BusinessException() {
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }

    public BusinessException(ResponseStatus responseStatus) {
        this.code = responseStatus.getCode();
        this.message = responseStatus.getMessage();
    }

}
