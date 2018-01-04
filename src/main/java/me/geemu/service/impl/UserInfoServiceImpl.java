package me.geemu.service.impl;

import me.geemu.config.JwtConfig;
import me.geemu.exception.NotFoundException;
import me.geemu.persistence.dao.primary.IUserInfoDao;
import me.geemu.persistence.model.primary.UserInfo;
import me.geemu.service.UserInfoService;
import me.geemu.util.AccessToken;
import me.geemu.util.JwtUtil;
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

    @Autowired
    private IUserInfoDao userInfoDao;

    @Autowired
    private JwtConfig jwtConfig;

    @Autowired
    private RedisUtil redisUtil;

    /**
     * @param account  根据账号密码查找用户 账号
     * @param password 密码
     * @return token
     */
    @Override
    public String findByAccountAndPassword(String account, String password) {
        UserInfo currentUser = userInfoDao.findByAccountAndPassword(account, password);
        if (currentUser == null) {
            throw new NotFoundException("未找到");
        }
        String token = JwtUtil.createJWT(new AccessToken(currentUser.getId(), currentUser.getAccount(), currentUser.getPassword()), jwtConfig);
        // 将token写入redis
        redisUtil.put("login_user:" + token, currentUser, jwtConfig.getExpiresSecond());
        return token;
    }

}
