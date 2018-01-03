package me.geemu.service.impl;

import me.geemu.config.JwtConfig;
import me.geemu.exception.NotFoundException;
import me.geemu.persistence.dao.secondary.IUserInfoSecondaryDao;
import me.geemu.persistence.model.secondary.UserInfoSecondary;
import me.geemu.service.IUserServiceSecondary;
import me.geemu.util.AccessToken;
import me.geemu.util.JwtUtil;
import me.geemu.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Geemu
 * Email: cfmmail@sina.com
 * Date: 2018/1/3  15:18
 * Description: me.geemu.service.impl
 */
@Service
public class IUserServiceSecondaryImpl implements IUserServiceSecondary {
    @Autowired
    private IUserInfoSecondaryDao userInfoSecondaryDao;

    @Autowired
    private JwtConfig jwtConfig;

    @Autowired
    private RedisUtil redisUtil;

    /**
     * 根据账号密码查找用户 返回token
     *
     * @param account  账号
     * @param password 密码
     * @return token
     */
    @Override
    public String findByAccountAndPassword(String account, String password) {
        UserInfoSecondary currentUser = userInfoSecondaryDao.findByAccountAndPassword(account, password);
        if (currentUser == null) {
            throw new NotFoundException("未找到");
        }
        String token = JwtUtil.createJWT(new AccessToken(currentUser.getId(), currentUser.getAccount(), currentUser.getPassword()), jwtConfig);
        // 将token写入redis
        redisUtil.put("login_user:" + token, currentUser, jwtConfig.getExpiresSecond());
        return token;
    }
}
