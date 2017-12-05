package me.geemu.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import me.geemu.persistence.model.UserInfo;
import me.geemu.service.IUserInfoService;
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

    @ApiOperation(value = "用户登陆", notes = "用户登陆", response = UserInfo.class)
    @GetMapping("/{id}")
    public UserInfo login(@PathVariable Integer id) {
        UserInfo response;
        response = userInfoService.findById(id);
        return response;
    }
}
