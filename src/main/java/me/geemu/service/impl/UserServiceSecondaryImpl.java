package me.geemu.service.impl;

import me.geemu.service.UserServiceSecondary;
import org.springframework.stereotype.Service;

/**
 * @author Geemu
 * Email: cfmmail@sina.com
 * Date: 2018/1/3  15:18
 * Description: me.geemu.service.impl
 */
@Service
public class UserServiceSecondaryImpl implements UserServiceSecondary {

    /**
     * 根据账号密码查找用户 返回token
     *
     * @param account  账号
     * @param password 密码
     * @return token
     */
    @Override
    public String findByAccountAndPassword(String account, String password) {
        return "";
    }
}
