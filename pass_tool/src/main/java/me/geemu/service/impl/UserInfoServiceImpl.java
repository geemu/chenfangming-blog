package me.geemu.service.impl;

import me.geemu.domain.response.LoginResponseVO;
import me.geemu.service.UserInfoService;
import org.springframework.stereotype.Service;

/**
 * Author: 陈方明
 * Email: cfmmail@sina.com
 * Date: 2017/10/31 13:52
 * Description:
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    /**
     * 根据用户名和密码登录
     *
     * @param account
     * @param password
     * @return
     */
    @Override
    public LoginResponseVO LoginByAccount(String account, String password) {
        return null;
    }
}
