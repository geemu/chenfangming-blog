package me.geemu.service;

import me.geemu.persistence.model.UserInfo;

/**
 * @Author: Geemu
 * Email:cfmmail@sina.com
 * Date: 2017/12/5 12:29
 * Description:
 */
public interface IUserInfoService {
    /**
     * 根据id查找用户
     *
     * @param id
     * @return
     */
    UserInfo findById(Integer id);

    /**
     * 根据账号密码查找用户
     *
     * @param account
     * @param password
     * @return
     */
    UserInfo findByAccoundAndPassword(String account, String password);
}
