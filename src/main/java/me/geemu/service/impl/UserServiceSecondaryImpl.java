package me.geemu.service.impl;

import me.geemu.config.JwtConfig;
import me.geemu.exception.NotFoundException;
import me.geemu.persistence.dao.secondary.UserInfoSecondaryMapper;
import me.geemu.persistence.model.secondary.UserInfoSecondary;
import me.geemu.service.UserServiceSecondary;
import me.geemu.util.AccessToken;
import me.geemu.util.JwtUtil;
import me.geemu.util.RedisUtil;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author Geemu
 * Email: cfmmail@sina.com
 * Date: 2018/1/3  15:18
 * Description: me.geemu.service.impl
 */
@Service
public class UserServiceSecondaryImpl implements UserServiceSecondary {
    @Autowired
    private UserInfoSecondaryMapper userInfoSecondaryDao;

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
        Example example = new Example(UserInfoSecondary.class);
        example.createCriteria()
                .andEqualTo("account", account)
                .andEqualTo("password", password)
        ;
        List<UserInfoSecondary> existList = userInfoSecondaryDao.selectByExample(example);
        if (CollectionUtils.isEmpty(existList)) {
            throw new NotFoundException("用户名或密码错误");
        }
        UserInfoSecondary currentUser = existList.get(0);
        String token = JwtUtil.createJWT(new AccessToken(currentUser.getId(), currentUser.getAccount(), currentUser.getPassword()), jwtConfig);
        // 将token写入redis
        redisUtil.put("login_user:" + token, currentUser, jwtConfig.getExpiresSecond());
        return token;
    }
}
