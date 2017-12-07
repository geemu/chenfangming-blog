package me.geemu.controller;

import io.jsonwebtoken.Claims;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import me.geemu.config.JwtConfig;
import me.geemu.domain.response.StringResponse;
import me.geemu.persistence.model.UserInfo;
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

    @ApiOperation(value = "用户登陆", notes = "用户登陆", response = StringResponse.class)
    @PostMapping("login")
    public StringResponse login(@RequestParam("account") String account, @RequestParam("password") String password) {
        StringResponse res = new StringResponse();
        res.setResp(userInfoService.findByAccoundAndPassword(account, password));
        return res;
    }

    @ApiOperation(value = "用户登陆", notes = "用户登陆", response = boolean.class)
    @PostMapping("check")
    public boolean checkAccessToken(@RequestParam("accessToken") String accessToken) {
        Claims cl = JwtUtil.parseJWT(accessToken, jwtConfig.getBase64Secret());
        System.out.println(cl);
        return true;
    }
}
