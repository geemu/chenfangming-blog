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
    UserInfo findById(Long id);

    /**
     * 根据账号密码查找用户 返回token
     *
     * @param account
     * @param password
     * @return
     */
    String findByAccoundAndPassword(String account, String password);

    /**
     * 修改密码
     *
     * @param oldPassword
     * @param newPassword
     * @param userId
     * @return
     */
    boolean updatePassword(String oldPassword, String newPassword, Long userId, String token);
}
