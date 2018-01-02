package me.geemu.enums;

import lombok.Getter;

/**
 * @author Geemu
 * Email:cfmmail@sina.com
 * Date: 2017/12/5 13:51
 * Description: 枚举值
 */
public enum ResponseEnum {

    /**
     * 无效的token
     */
    INVALID_TOKEN_ERROR(-10003, "无效的token"),
    /**
     * 登陆失败
     */
    ACCOUNT_OR_PASSWORD_FAIL(-10004, "用户名或密码错误");

    @Getter
    private Integer code;

    @Getter
    private String message;

    ResponseEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
