package com.chenfangming.domain.response;

import io.swagger.annotations.ApiParam;
import lombok.Data;

/**
 * @author Geemu
 * Email: cfmmail@sina.com
 * Date: 2017/12/7  10:49
 * Description:
 */
@Data
public class LoginResponse {
    @ApiParam("token")
    private String token;
    @ApiParam("用户名")
    private String userName;
    @ApiParam("性别 0未知 1男 2女")
    private byte sex;
    @ApiParam("邮箱")
    private String email;
    @ApiParam("账号状态 0未激活 1锁定 2过期 3正常")
    private byte status;

}
