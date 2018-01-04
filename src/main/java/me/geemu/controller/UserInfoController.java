package me.geemu.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import me.geemu.domain.response.LoginResponse;
import me.geemu.service.UserInfoService;
import me.geemu.service.UserServiceSecondary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
     * 从库
     */
    @Autowired
    private UserServiceSecondary userServiceSecondary;

    /**
     * 根据用户名密码登陆
     *
     * @param account  账号
     * @param password 密码
     * @return token
     */
    @ApiOperation(value = "主库用户登陆", notes = "主库用户登陆 自己写SQL", response = LoginResponse.class)
    @PostMapping("login")
    public LoginResponse login(@RequestParam("account") String account, @RequestParam("password") String password) {
        return new LoginResponse(userInfoService.findByAccountAndPassword(account, password));
    }

    /**
     * 根据用户名密码登陆
     *
     * @param account  账号
     * @param password 密码
     * @return token
     */
    @ApiOperation(value = "从库用户登陆", notes = "从库用户登陆 tk mybatis", response = LoginResponse.class)
    @PostMapping("login_secondary")
    public LoginResponse loginSecondary(@RequestParam("account") String account, @RequestParam("password") String password) {
        return new LoginResponse(userServiceSecondary.findByAccountAndPassword(account, password));
    }

}
