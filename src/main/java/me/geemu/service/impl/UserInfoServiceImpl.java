package me.geemu.service.impl;

import me.geemu.config.JwtConfig;
import me.geemu.persistence.dao.primary.UserInfoMapper;
import me.geemu.service.UserInfoService;
import me.geemu.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Geemu
 * Email:cfmmail@sina.com
 * Date: 2017/12/5 12:30
 * Description:
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {


    /**
     * @param account  根据账号密码查找用户 账号
     * @param password 密码
     * @return token
     */
    @Override
    public String findByAccountAndPassword(String account, String password) {
        return "";
    }

}
