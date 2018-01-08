package com.chenfangming.util;

import com.chenfangming.enums.ResponseEnum;
import com.chenfangming.exception.UnAuthorizedException;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Geemu
 * Email: cfmmail@sina.com
 * Date: 2017/12/13  13:35
 * Description: user
 */
public class RequestUtil {
    /**
     * 获取userId
     *
     * @return
     */
    public static Long getUserId() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        Long userId = Long.valueOf(request.getAttribute("userId").toString());
        if (userId == null) {
            throw new UnAuthorizedException(ResponseEnum.ACCOUNT_OR_PASSWORD_FAIL);
        }
        return userId;
    }
}
