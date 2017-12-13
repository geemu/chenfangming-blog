package me.geemu.enums;

import lombok.Getter;

/**
 * @Author: Geemu
 * Email:cfmmail@sina.com
 * Date: 2017/12/5 13:51
 * Description:
 */
public enum ResponseEnum {
    /**
     * 禁止访问 默认
     */
    FORBIDDEN_ERROR_DEFAULT(-10000, "禁止访问"),

    /**
     * 资源不存在 默认
     */
    NOT_FOUND_ERROR_DEFAULT(-10001, "资源不存在"),

    /**
     * 未授权 默认
     */
    UNAUTHORIZED_ERROR_DEFAULT(-10002, "未授权"),

    /**
     * 服务器内部错误
     */
    INTERNAL_SERVER_ERROR(500, "服务器内部错误"),

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
