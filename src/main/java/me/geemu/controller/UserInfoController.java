package me.geemu.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import me.geemu.domain.model.UserInfo;
import me.geemu.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @PostMapping("/{id}")
    public UserInfo login(@PathVariable Integer id) {
        UserInfo response;
        response = userInfoService.findById(id);
        return response;
    }
}
