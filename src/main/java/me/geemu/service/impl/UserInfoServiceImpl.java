package me.geemu.service.impl;

import me.geemu.config.JwtConfig;
import me.geemu.enums.ResponseEnum;
import me.geemu.exception.UnAuthorizedException;
import me.geemu.persistence.dao.IUserInfoDao;
import me.geemu.persistence.model.UserInfo;
import me.geemu.service.IUserInfoService;
import me.geemu.util.JwtUtil;
import me.geemu.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Author: Geemu
 * Email:cfmmail@sina.com
 * Date: 2017/12/5 12:30
 * Description:
 */
@Service
public class UserInfoServiceImpl implements IUserInfoService {

    @Autowired
    private IUserInfoDao userDao;

    @Autowired
    private JwtConfig jwtConfig;

    @Autowired
    private RedisUtil redisUtil;

    /**
     * 根据id查找用户
     *
     * @param id
     * @return
     */
    @Override
    public UserInfo findById(Integer id) {
        UserInfo response;
        response = userDao.findById(id);
        return response;
    }

    /**
     * 根据账号密码查找用户
     *
     * @param account
     * @param password
     * @return
     */
    @Override
    public String findByAccoundAndPassword(String account, String password) {
        UserInfo currentUser = userDao.findByAccoundAndPassword(account, password);
        if (currentUser == null) {
            throw new UnAuthorizedException(ResponseEnum.ACCOUNT_OR_PASSWORD_FAIL);
        }
        String token = JwtUtil.createJWT(currentUser.getId(), jwtConfig);
        // 将token写入redis
        redisUtil.put("login_user:" + token, currentUser, jwtConfig.getExpiresSecond());
        return token;
    }
}
