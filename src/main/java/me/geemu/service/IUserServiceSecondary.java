package me.geemu.service;

/**
 * @author Geemu
 * Email: cfmmail@sina.com
 * Date: 2018/1/3  15:18
 * Description: me.geemu.service
 */
public interface IUserServiceSecondary {
    /**
     * 根据账号密码查找用户 返回token
     *
     * @param account  账号
     * @param password 密码
     * @return token
     */
    String findByAccountAndPassword(String account, String password);
}
