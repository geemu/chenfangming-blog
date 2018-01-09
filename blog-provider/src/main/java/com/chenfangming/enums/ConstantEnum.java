package com.chenfangming.enums;

import lombok.Getter;

/**
 * @author Geemu
 * Email: cfmmail@sina.com
 * Date: 2018/1/9  9:27
 * Description: com.chenfangming.enums
 */
public enum ConstantEnum {
    /**
     * 登陆用户token前缀
     */
    PREFIX_LOGIN_USER("login_user:"),
    /**
     * 登陆管理员token前缀
     */
    PREFIX_LOGING_ADMIN("LOGIN_ADMIN:");

    @Getter
    private String instance;

    ConstantEnum(String instance) {
        this.instance = instance;
    }
}
