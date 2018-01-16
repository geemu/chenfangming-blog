package com.chenfangming.service.impl;

import com.chenfangming.config.JwtConfig;
import com.chenfangming.domain.response.LoginResponse;
import com.chenfangming.enums.ConstantEnum;
import com.chenfangming.exception.NotFoundException;
import com.chenfangming.persistence.dao.primary.IEmployeeDao;
import com.chenfangming.persistence.model.primary.Employee;
import com.chenfangming.persistence.model.primary.EmployeeExample;
import com.chenfangming.service.EmployeeService;
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
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private IEmployeeDao employeeDao;
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
        EmployeeExample example = new EmployeeExample();
        example.createCriteria()
                .andUserNameEqualTo(userName)
                .andPasswordEqualTo(password)
                .andIsDeleteEqualTo(false)
        ;
        List<Employee> existList = employeeDao.selectByExample(example);
        if (CollectionUtils.isEmpty(existList)) {
            throw new NotFoundException("用户名或密码错误");
        }
        Employee currentUser = existList.get(0);
        // 将token写入redis
        String token = JwtUtil.createJWT(currentUser.getUserName(), jwtConfig);
        redisUtil.put(ConstantEnum.PREFIX_LOGIN_USER + token, currentUser, jwtConfig.getExpiresSecond());
        LoginResponse loginResponse = new LoginResponse();
        loginResponse = mapper.map(currentUser, loginResponse.getClass());
        loginResponse.setAuthenticate(token);
        return loginResponse;
    }
}
