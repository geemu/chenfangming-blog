package me.geemu.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import me.geemu.persistence.model.UserInfo;
import me.geemu.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Geemu
 * Email:cfmmail@sina.com
 * Date: 2017/12/5 16:30
 * Description:
 */
@RestController
@RequestMapping("test")
@Api(description = "测试")
public class TestController {
    @Autowired
    private ITestService testService;

    @ApiOperation(value = "异常测试", notes = "异常测试", response = Integer.class)
    @GetMapping("/{type}")
    public int testExc(@PathVariable Integer type) {
        return testService.testExc(type);
    }
}
