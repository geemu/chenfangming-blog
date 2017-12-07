package me.geemu.service.impl;

import me.geemu.config.JwtConfig;
import me.geemu.enums.ResponseEnum;
import me.geemu.exception.UnAuthorizedException;
import me.geemu.persistence.dao.IUserInfoDao;
import me.geemu.persistence.model.UserInfo;
import me.geemu.service.IUserInfoService;
import me.geemu.util.JwtUtil;
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
    private IUserInfoDao userDao;

    @Autowired
    private JwtConfig jwtConfig;

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
        return JwtUtil.createJWT(currentUser.getId(), jwtConfig).getAccessToken();
    }
}
