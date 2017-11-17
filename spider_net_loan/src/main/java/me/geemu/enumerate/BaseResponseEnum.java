package me.geemu.enumerate;

import lombok.Getter;

/**
 * @author geemu
 * Email：cfmmail@sina.com
 * Date：2017/10/10 17:16
 * Despriction：响应码
 */
@Getter
public enum BaseResponseEnum {

    /**
     * 成功响应且得到期望结果 有正确数据返回
     */
    DEFAULT_OK(200, "success"),
    /**
     * 系统异常
     */
    DEFAULT_UNKNOW_ERROR(500, "系统维护中");

    /**
     * 1000 授权相关
     * 2000 用户相关
     * 3000业务相关 4000 业务相关
     */
    private Integer code;

    private String message;

    BaseResponseEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
