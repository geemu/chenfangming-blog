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
     * 未知错误
     */
    UNKNOWN(-1, "未知错误"),

    /**
     * 正常
     */
    OK(200, "OK"),

    /**
     * 已创建
     */
    CREATED(201, "创建成功"),

    /**
     * 无内容，用于put请求更新成功
     */
    NO_CONTENT(204, "其他异常"),

    /**
     * 非法请求
     */
    BAD_REQUEST(400, "非法请求"),

    /**
     * 未授权
     */
    UNAUTHORIZED(401, "未授权"),

    /**
     * 禁止访问
     */

    FORBIDDEN(403, "禁止访问"),

    /**
     * 资源不存在
     */
    NOT_FOUND(404, "资源不存在"),

    /**
     * 请求超时
     */
    REQUEST_TIMEOUT(408, "请求超时"),

    /**
     * 服务器内部错误
     */
    INTERNAL_SERVER_ERROR(500, "内部错误"),;

    @Getter
    private Integer code;

    @Getter
    private String message;

    ResponseEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
