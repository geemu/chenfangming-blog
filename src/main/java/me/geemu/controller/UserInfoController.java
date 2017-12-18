package me.geemu.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import me.geemu.domain.request.ChangePasswordRequest;
import me.geemu.domain.response.LoginResponse;
import me.geemu.service.IUserInfoService;
import me.geemu.util.RequestUtil;
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

    /**
     * 根据用户名密码登陆
     *
     * @param account
     * @param password
     * @return
     */
    @ApiOperation(value = "用户登陆", notes = "用户登陆", response = LoginResponse.class)
    @PostMapping("login")
    public LoginResponse login(@RequestParam("account") String account, @RequestParam("password") String password) {
        return new LoginResponse(userInfoService.findByAccoundAndPassword(account, password));
    }

    /**
     * 修改密码
     *
     * @param changePasswordRequest
     * @return
     */
    @ApiImplicitParams({
            @ApiImplicitParam(name = "Authorization", value = "Authorization", required = true, dataType = "String", paramType = "header")
    })
    @ApiOperation(value = "修改密码", notes = "修改密码", response = boolean.class)
    @PutMapping("password")
    public boolean updatePassword(@RequestBody ChangePasswordRequest changePasswordRequest, @RequestHeader("Authorization") String token) {
        return userInfoService.updatePassword(changePasswordRequest.getOldPassword(), changePasswordRequest.getNewPassword(), RequestUtil.getUserId(), token);
    }
}
