package com.chenfangming.service;

import com.chenfangming.domain.response.LoginResponse;

/**
 * @author Geemu
 * Email: cfmmail@sina.com
 * Date: 2017/12/5 12:29
 * Description:
 */
public interface EmployeeService {

    /**
     * 根据用户名密码查找用户 返回token
     *
     * @param userName 用户名
     * @param password 密码
     * @return LoginResponse
     */
    LoginResponse findByUserNameAndPassword(String userName, String password);

}
