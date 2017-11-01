package me.geemu.service;

import me.geemu.domain.response.LoginResponseVO;


/**
 * @author geemu
 * Email：cfmmail@sina.com
 * Date：2017/10/10 17:16
 * Despriction：用户接口
 */
public interface UserInfoService {

    /**
     * 根据用户名和密码登录
     *
     * @param account
     * @param password
     * @return
     */
    LoginResponseVO loginByAccount(String account, String password);
}
