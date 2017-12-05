package me.geemu.service.impl;

import me.geemu.domain.model.UserInfo;
import me.geemu.persistence.dao.IUserInfoDao;
import me.geemu.service.IUserInfoService;
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

    @Override
    public UserInfo findById(Integer id) {
        UserInfo response;
        response = userDao.findById(id);
        return response;
    }
}
