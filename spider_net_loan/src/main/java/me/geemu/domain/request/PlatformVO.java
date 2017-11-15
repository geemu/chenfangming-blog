package me.geemu.domain.request;

import lombok.Data;

/**
 * @author geemu
 * Email：cfmmail@sina.com
 * Date：2017/11/15 17:33
 * Despriction：平台信息
 */
@Data
public class PlatformVO {
    /**
     * 爬取平台的唯一标识
     */
    private String platformCode;
    /**
     * 对应平台的账号
     */
    private String account;
    /**
     * 对应平台的密码
     */
    private String password;
    /**
     * 前端获取的cookie
     */
    private String cookies;
    /**
     * 图形验证码标识
     */
    private String imgId;
    /**
     * 图形验证码结果
     */
    private String imgCode;
    /**
     * 短信验证码标识
     */
    private String smsId;
    /**
     * 短信验证码结果
     */
    private String smsCode;
}
