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

    public LoginResponse(String token) {
        this.token = token;
    }

}
