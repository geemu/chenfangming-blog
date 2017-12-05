package me.geemu.domain.response;

import lombok.Data;

/**
 * @Author: Geemu
 * Email:cfmmail@sina.com
 * Date: 2017/12/5 16:46
 * Description:
 */
@Data
public class ErrorResponse {
    private Integer code;
    private String message;
}
