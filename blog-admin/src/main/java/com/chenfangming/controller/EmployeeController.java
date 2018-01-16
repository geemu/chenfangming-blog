package com.chenfangming.controller;

import com.chenfangming.domain.response.LoginResponse;
import com.chenfangming.service.EmployeeService;
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
@RequestMapping("employee")
@Api(description = "员工相关")
public class EmployeeController {
    /**
     * 主库
     */
    @Autowired
    private EmployeeService employeeService;

    /**
     * @param userName 用户名
     * @param password 密码
     * @return LoginResponse 根据用户名密码登陆
     */
    @ApiOperation(value = "员工登陆", notes = "主库员工登陆", response = LoginResponse.class)
    @PostMapping("login")
    public LoginResponse login(@RequestParam("userName") String userName, @RequestParam("password") String password) {
        LoginResponse user = employeeService.findByUserNameAndPassword(userName, password);
        return user;
    }

}
