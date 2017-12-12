package me.geemu.controller;

import io.jsonwebtoken.Claims;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import me.geemu.config.JwtConfig;
import me.geemu.domain.response.LoginResponse;
import me.geemu.service.IUserInfoService;
import me.geemu.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: Geemu
 * Email:cfmmail@sina.com
 * Date: 2017/12/5 10:38
 * Description:
 */
@RestController
@RequestMapping("user")
@Api(description = "用户相关")
public class UserInfoController {

    @Autowired
    private IUserInfoService userInfoService;

    @Autowired
    private JwtConfig jwtConfig;

    @ApiOperation(value = "用户登陆", notes = "用户登陆", response = LoginResponse.class)
    @PostMapping("login")
    public LoginResponse login(@RequestParam("account") String account, @RequestParam("password") String password) {
        LoginResponse res = new LoginResponse();
        res.setToken(userInfoService.findByAccoundAndPassword(account, password));
        return res;
    }

    @ApiOperation(value = "jwt解密", notes = "jwt解密", response = boolean.class)
    @PostMapping("check")
    public boolean checkAccessToken(@RequestParam("accessToken") String accessToken) {
        Claims cl = JwtUtil.parseJWT(accessToken, jwtConfig.getBase64Secret());
        if (cl != null) {
            System.out.println(cl.get("userId"));
            return true;
        }
        return false;
    }
}
