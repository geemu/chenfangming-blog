package me.geemu.domain;

import lombok.Data;
import me.geemu.enums.ResponseEnum;

/**
 * @author Geemu
 * Email:cfmmail@sina.com
 * Date: 2017/12/5 16:46
 * Description:
 */
@Data
public class ErrorResponse {
    private Integer code;
    private String message;

    public ErrorResponse(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
