package me.geemu.domain.request;

import io.swagger.annotations.ApiParam;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

/**
 * @Author: Geemu
 * Email:cfmmail@sina.com
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
