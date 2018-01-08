package com.chenfangming.service.impl;

import com.chenfangming.config.JwtConfig;
import com.chenfangming.exception.BusinessException;
import com.chenfangming.exception.NotFoundException;
import com.chenfangming.persistence.dao.primary.IUserInfoDao;
import com.chenfangming.persistence.model.primary.UserInfo;
import com.chenfangming.persistence.model.primary.UserInfoExample;
import com.chenfangming.service.UserInfoService;
import com.chenfangming.util.AccessToken;
import com.chenfangming.util.JwtUtil;
import com.chenfangming.util.RedisUtil;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


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
    private RedisUtil redisUtil;
    @Autowired
    private JwtConfig jwtConfig;

    /**
     * @param userName 根据用户名密码查找用户 账号
     * @param password 密码
     * @return token
     */
    @Override
    public String findByUserNameAndPassword(String userName, String password) {
        UserInfoExample example = new UserInfoExample();
        example.createCriteria()
                .andUserNameEqualTo(userName)
                .andPasswordEqualTo(password)
                .andIsDeleteEqualTo(false)
        ;
        List<UserInfo> existList = userInfoDao.selectByExample(example);
        if (CollectionUtils.isEmpty(existList)) {
            throw new NotFoundException("用户名或密码错误");
        }
        UserInfo currentUser = existList.get(0);
        if (currentUser.getStatus() == 3) {
            String token = JwtUtil.createJWT(new AccessToken(currentUser.getId(), currentUser.getUserName()), jwtConfig);
            // 将token写入redis
            redisUtil.put("login_user:" + token, currentUser, jwtConfig.getExpiresSecond());
            return token;
        } else if (currentUser.getStatus() == 0) {
            throw new BusinessException("未激活");
        } else if (currentUser.getStatus() == 1) {
            throw new BusinessException("锁定");
        } else if (currentUser.getStatus() == 2) {
            throw new BusinessException("过期");
        } else {
            throw new BusinessException("未知错误");
        }

    }

}
