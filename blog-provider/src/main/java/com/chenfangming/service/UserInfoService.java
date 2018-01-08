package com.chenfangming.service;

/**
 * @author Geemu
 * Email: cfmmail@sina.com
 * Date: 2017/12/5 12:29
 * Description:
 */
public interface UserInfoService {

    /**
     * 根据账号密码查找用户 返回token
     *
     * @param userName
     * @param password
     * @return
     */
    String findByUserNameAndPassword(String userName, String password);

}
