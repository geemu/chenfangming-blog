package com.chenfangming.controller;

import com.chenfangming.domain.response.LoginResponse;
import com.chenfangming.service.UserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Geemu
 * Email: cfmmail@sina.com
 * Date: 2017/12/5 10:38
 * Description:
 */
@RestController
@RequestMapping("user")
@Api(description = "用户相关")
public class UserInfoController {
    /**
     * 主库
     */
    @Autowired
    private UserInfoService userInfoService;

    /**
     * @param userName 用户名
     * @param password 密码
     * @return LoginResponse 根据用户名密码登陆
     */
    @ApiOperation(value = "用户登陆", notes = "主库用户登陆 自己写SQL", response = LoginResponse.class)
    @PostMapping("login")
    public LoginResponse login(@RequestParam("userName") String userName, @RequestParam("password") String password) {
        return userInfoService.findByUserNameAndPassword(userName, password);
    }

}
