package me.geemu.domain.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author: Geemu
 * Email:cfmmail@sina.com
 * Date: 2017/12/5 13:51
 * Description:
 */
@Data
public class AccessTokenResponse {
    @ApiModelProperty(value = "token,登录之后的接口访问都需要提交该参数")
    private String accessToken;
    private Long userId;
    private Long expires;
}
