package me.geemu.interceptor;

import io.jsonwebtoken.Claims;
import me.geemu.config.JwtConfig;
import me.geemu.enums.ResponseEnum;
import me.geemu.exception.BusinessException;
import me.geemu.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: Geemu
 * Email:cfmmail@sina.com
 * Date: 2017/12/12  16:21
 * Description: 拦截请求,检查用户是否登录
 */
@Component
public class LoginInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    private JwtConfig jwtConfig;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        String authorization = request.getHeader("Authorization");
        Claims claims;
        try {
            claims = JwtUtil.parseJWT(authorization, jwtConfig.getBase64Secret());
        } catch (Exception e) {
            throw new BusinessException(ResponseEnum.INVALID_TOKEN_ERROR);
        }
        if (claims != null) {
            // token校验通过
            request.setAttribute("userId", claims.get("userId"));
            return true;
        }
        // 伪造的Authorization 或者没有登陆
        return false;
    }
}
