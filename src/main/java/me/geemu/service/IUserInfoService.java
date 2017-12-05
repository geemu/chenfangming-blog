package me.geemu.service;

import me.geemu.domain.model.UserInfo;

/**
 * @Author: Geemu
 * Email:cfmmail@sina.com
 * Date: 2017/12/5 12:29
 * Description:
 */
public interface IUserInfoService {
    UserInfo findById(Integer id);
}
