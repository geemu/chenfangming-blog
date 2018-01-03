package me.geemu.domain.request;

import io.swagger.annotations.ApiParam;
import lombok.Data;

/**
 * @author Geemu
 * Email: cfmmail@sina.com
 * Date: 2017/12/12  17:37
 * Description: user
 */
@Data
public class ChangePasswordRequest {
    @ApiParam("原始密码")
    private String oldPassword;
    @ApiParam("新密码")
    private String newPassword;

}
