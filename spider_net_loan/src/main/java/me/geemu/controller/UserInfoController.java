package me.geemu.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import me.geemu.domain.response.LoginResponseVO;
import me.geemu.service.UserInfoService;
import me.geemu.domain.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author geemu
 * Email：cfmmail@sina.com
 * Date：2017/10/10 17:16
 * Despriction：用户控制器
 */
@RestController
@RequestMapping("user")
@Api(description = "密码管理工具，用户相关")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;


    @ApiOperation(value = "用户名密码登录", notes = "用户名密码登录", response = LoginResponseVO.class)
    @PostMapping("/login_account")
    public BaseResponse<LoginResponseVO> loginByAccount(@RequestParam("account") String account, @RequestParam("password") String password) {
        BaseResponse<LoginResponseVO> response = new BaseResponse<>();
        response.setContent(userInfoService.loginByAccount(account, password));
        return response;
    }
}
