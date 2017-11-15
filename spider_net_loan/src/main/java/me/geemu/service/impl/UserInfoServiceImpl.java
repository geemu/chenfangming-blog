package me.geemu.service.impl;

import me.geemu.domain.response.LoginResponseVO;
import me.geemu.service.UserInfoService;
import org.springframework.stereotype.Service;


/**
 * @author geemu
 * Email：cfmmail@sina.com
 * Date：2017/10/10 17:16
 * Despriction：用户接口实现类
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
    public LoginResponseVO loginByAccount(String account, String password) {
        return null;
    }
}
