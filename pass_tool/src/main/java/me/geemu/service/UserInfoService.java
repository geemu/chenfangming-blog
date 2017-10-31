package me.geemu.service;

import me.geemu.domain.response.LoginResponseVO;

/**
 * Author: 陈方明
 * Email: cfmmail@sina.com
 * Date: 2017/10/31 13:49
 * Description:
 */
public interface UserInfoService {

    /**
     * 根据用户名和密码登录
     *
     * @param account
     * @param password
     * @return
     */
    LoginResponseVO LoginByAccount(String account, String password);
}
