package me.geemu.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

@Component
public class AllRequestInterceptor extends HandlerInterceptorAdapter {
    Logger logger = LoggerFactory.getLogger(getClass());

    private final int expireTime = 60 * 60 * 24 * 7;

    @Value("${cookie.domain}")
    private String cookieDomain;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String currentUser = request.getHeader("token");
        StringBuilder logSb = new StringBuilder("\r\n");
        logSb.append(String.format("[RequestURL]\t%s\r\n", request.getRequestURI()));
        Cookie[] cookies = request.getCookies();
        boolean hasCookie = false;
        if (cookies != null && cookies.length > 0) {
            for (Cookie cookie : cookies) {
                if ("token".equals(cookie.getName())) {
                    hasCookie = true;
                    break;
                }
            }
        }

        // 给新用户一个cookie
        if (StringUtils.isEmpty(currentUser) && !hasCookie) {
            String token = UUID.randomUUID().toString().replace("-", "");
            response.setHeader("token", token);
            Cookie cookie = new Cookie("token", token);
            cookie.setHttpOnly(true);
            cookie.setDomain(cookieDomain);
            cookie.setPath("/");
            cookie.setMaxAge(expireTime);
            response.addCookie(cookie);
        }
        logger.info(logSb.toString());
        return true;
    }
}
