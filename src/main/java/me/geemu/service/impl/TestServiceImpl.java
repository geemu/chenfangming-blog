package me.geemu.service.impl;

import me.geemu.enums.ResponseStatus;
import me.geemu.exception.BusinessException;
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
            System.out.println("自定义异常");
            throw new BusinessException(ResponseStatus.FORBIDDEN);
        }
        if (type == 3) {
            System.out.println("未知异常");
            Integer a = null;
            int c = a - 1;
            return type;
        }
        return type;
    }
}
