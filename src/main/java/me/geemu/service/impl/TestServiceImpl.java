package me.geemu.service.impl;

import me.geemu.enums.ResponseEnum;
import me.geemu.exception.BusinessException;
import me.geemu.exception.UnAuthorizedException;
import me.geemu.service.ITestService;
import org.springframework.stereotype.Service;

/**
 * @Author: Geemu
 * Email:cfmmail@sina.com
 * Date: 2017/12/5 16:24
 * Description:
 */
@Service
public class TestServiceImpl implements ITestService {
    @Override
    public int testExc(Integer type) {
        if (type == 1) {
            System.out.println("正常");
            return type;
        }
        if (type == 2) {
            System.out.println("未授权");
            throw new UnAuthorizedException(ResponseEnum.UNAUTHORIZED);
        }
        if (type == 3) {
            System.out.println("其他异常");
            throw new BusinessException(ResponseEnum.NO_CONTENT);
        }
        if (type == 4) {
            System.out.println("未知异常");
            Integer a = null;
            int c = a - 1;
            return type;
        }

        return type;
    }
}
