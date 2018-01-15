package com.chenfangming.service.impl;

import com.chenfangming.config.JwtConfig;
import com.chenfangming.domain.response.LoginResponse;
import com.chenfangming.enums.ConstantEnum;
import com.chenfangming.exception.NotFoundException;
import com.chenfangming.persistence.dao.primary.IUserDao;
import com.chenfangming.persistence.model.primary.User;
import com.chenfangming.persistence.model.primary.UserExample;
import com.chenfangming.service.UserService;
import com.chenfangming.util.JwtUtil;
import com.chenfangming.util.RedisUtil;
import org.apache.commons.collections.CollectionUtils;
import org.dozer.Mapper;
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
public class UserServiceImpl implements UserService {

    @Autowired
    private IUserDao userDao;
    @Autowired
    private RedisUtil redisUtil;
    @Autowired
    private JwtConfig jwtConfig;
    @Autowired
    private Mapper mapper;

    /**
     * @param userName 根据用户名密码查找用户 账号
     * @param password 密码
     * @return LoginResponse
     */
    @Override
    public LoginResponse findByUserNameAndPassword(String userName, String password) {
        UserExample example = new UserExample();
        example.createCriteria()
                .andUserNameEqualTo(userName)
                .andPasswordEqualTo(password)
                .andIsDeleteEqualTo(false)
        ;
        List<User> existList = userDao.selectByExample(example);
        if (CollectionUtils.isEmpty(existList)) {
            throw new NotFoundException("用户名或密码错误");
        }
        User currentUser = existList.get(0);
        // 将token写入redis
        String token = JwtUtil.createJWT(currentUser.getUserName(), jwtConfig);
        redisUtil.put(ConstantEnum.PREFIX_LOGIN_USER + token, currentUser, jwtConfig.getExpiresSecond());
        LoginResponse loginResponse = new LoginResponse();
        loginResponse = mapper.map(currentUser, loginResponse.getClass());
        loginResponse.setAuthenticate(token);
        return loginResponse;
    }
}
