package me.geemu.service.impl;

import me.geemu.config.JwtConfig;
import me.geemu.enums.ResponseEnum;
import me.geemu.exception.ForbiddenException;
import me.geemu.exception.UnAuthorizedException;
import me.geemu.persistence.dao.IUserInfoDao;
import me.geemu.persistence.model.UserInfo;
import me.geemu.service.IUserInfoService;
import me.geemu.util.JwtUtil;
import me.geemu.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Geemu
 * Email:cfmmail@sina.com
 * Date: 2017/12/5 12:30
 * Description:
 */
@Service
public class UserInfoServiceImpl implements IUserInfoService {

    @Autowired
    private IUserInfoDao userInfoDao;

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
    public UserInfo findById(Long id) {
        UserInfo response;
        response = userInfoDao.findById(id);
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
        UserInfo currentUser = userInfoDao.findByAccoundAndPassword(account, password);
        if (currentUser == null) {
            throw new UnAuthorizedException(ResponseEnum.ACCOUNT_OR_PASSWORD_FAIL);
        }
        String token = JwtUtil.createJWT(currentUser.getId(), jwtConfig);
        // 将token写入redis
        redisUtil.put("login_user:" + token, currentUser, jwtConfig.getExpiresSecond());
        return token;
    }

    /**
     * 修改密码
     *
     * @param oldPassword
     * @param newPassword
     * @return
     */
    @Override
    public boolean updatePassword(String oldPassword, String newPassword, Long userId, String token) {
        // 根据用户id从Redis查询用户密码
        UserInfo oldUser = (UserInfo) redisUtil.selectByKey("login_user:" + token);
        if (oldUser == null) {
            throw new UnAuthorizedException("未找到用户");
        }
        if (newPassword.equalsIgnoreCase(oldUser.getPassword())) {
            throw new ForbiddenException("新密码与旧密码不能相同");
        }
        return userInfoDao.updatePasswprd(newPassword, userId) > 0;
    }
}
