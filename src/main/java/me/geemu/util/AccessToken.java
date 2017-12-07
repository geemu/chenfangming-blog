package me.geemu.util;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author: Geemu
 * Email:cfmmail@sina.com
 * Date: 2017/12/7  10:32
 * Description: user
 */
@Data
public class AccessToken {
    @ApiModelProperty(value = "token,登录之后的接口访问都需要提交该参数")
    private String accessToken;
    @ApiModelProperty(value = "token类型")
    private String tokenType;
    @ApiModelProperty(value = "过期时间")
    private Long expires;
    @ApiModelProperty(value = "用户id")
    private Integer userId;

    public AccessToken(String accessToken, String tokenType, Long expires) {
        this.accessToken = accessToken;
        this.tokenType = tokenType;
        this.expires = expires;
    }
}
