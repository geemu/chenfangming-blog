package me.geemu.enumerate;

import lombok.Getter;

/**
 * Author: geemu
 * Email: cfmmail@sina.com
 * Date: 2017/9/11 17:21
 * Description:
 */
@Getter
public enum BaseResponseEnum {

    DEFAULT_OK(200, "success"),
    DEFAULT_PLEASE_LOGIN(401, "请登录"),
    DEAFULT_LOGIN_ERROR(701, "用户名或密码错误"),
    DEFAULT_BUSINESS_ERROR(201, "error occured"),
    DEFAULT_BUSINESS_NO_FOUND_ASSORTMENT_ERROR(203, "未找到分类信息"),
    DEFAULT_UNKNOW_ERROR(500, "系统维护中"),

    DEFAULT_TEST_ERROR(300, "枚举异常");
    // 1000 授权相关
    // 2000 用户相关
    // 3000业务相关 4000 业务相关
    private Integer code;

    private String message;

    BaseResponseEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
