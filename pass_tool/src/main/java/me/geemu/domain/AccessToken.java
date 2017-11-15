package me.geemu.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author geemu
 * Email：cfmmail@sina.com
 * Date：2017/10/10 17:16
 * Despriction：
 */
@Data
public class AccessToken {
    @ApiModelProperty(value = "token")
    private String token;
    @ApiModelProperty(value = "expires")
    private Long expires;
    @ApiModelProperty(value = "userId")
    private Integer userId;
}
