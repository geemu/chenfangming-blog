package me.geemu.controller;

import io.jsonwebtoken.Claims;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import me.geemu.domain.request.ChangePasswordRequest;
import me.geemu.domain.response.LoginResponse;
import me.geemu.enums.ResponseEnum;
import me.geemu.exception.ForbiddenException;
import me.geemu.service.IUserInfoService;
import net.bytebuddy.implementation.bind.annotation.Default;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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


    @ApiOperation(value = "用户登陆", notes = "用户登陆", response = LoginResponse.class)
    @PostMapping("login")
    public LoginResponse login(@RequestParam("account") String account, @RequestParam("password") String password) {
        return new LoginResponse(userInfoService.findByAccoundAndPassword(account, password));
    }

    @ApiImplicitParams({
            @ApiImplicitParam(name = "Authorization", value = "token", required = true, dataType = "String", paramType = "header")
    })
    @ApiOperation(value = "修改密码", notes = "修改密码", response = boolean.class)
    @PutMapping("password")
    public boolean checkAccessToken(@RequestBody ChangePasswordRequest changePasswordRequest, @RequestAttribute("userId") long userId) {
        System.out.println("用户id：" + userId);
        return true;
    }
}
