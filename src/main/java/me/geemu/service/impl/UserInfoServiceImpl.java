package me.geemu.service.impl;

import me.geemu.config.JwtConfig;
import me.geemu.exception.NotFoundException;
import me.geemu.persistence.dao.primary.UserInfoMapper;
import me.geemu.persistence.model.primary.UserInfo;
import me.geemu.persistence.model.primary.UserInfoExample;
import me.geemu.service.UserInfoService;
import me.geemu.util.AccessToken;
import me.geemu.util.JwtUtil;
import me.geemu.util.RedisUtil;
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
    private UserInfoMapper userInfoMapper;
    @Autowired
    private RedisUtil redisUtil;
    @Autowired
    private JwtConfig jwtConfig;

    /**
     * @param account  根据账号密码查找用户 账号
     * @param password 密码
     * @return token
     */
    @Override
    public String findByAccountAndPassword(String account, String password) {
        UserInfoExample example = new UserInfoExample();
        example.createCriteria()
                .andAccountEqualTo(account)
                .andPasswordEqualTo(password)
        ;
        List<UserInfo> existList = userInfoMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(existList)) {
            throw new NotFoundException("用户名或密码错误");
        }
        UserInfo currentUser = existList.get(0);
        String token = JwtUtil.createJWT(new AccessToken(currentUser.getId(), currentUser.getAccount(), currentUser.getPassword()), jwtConfig);
        // 将token写入redis
        redisUtil.put("login_user:" + token, currentUser, jwtConfig.getExpiresSecond());
        return token;
    }

}
