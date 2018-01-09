package com.chenfangming.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Geemu
 * Email: cfmmail@sina.com
 * Date: 2017/12/5 10:38
 * Description:
 */
@Data
@Component
public class JwtConfig {
    @Value("${jwt.issuer}")
    private String issuer;
    @Value("${jwt.audience}")
    private String audience;
    @Value("${jwt.base64Secret}")
    private String base64Secret;
    /**
     * 有效时长
     */
    @Value("${jwt.expiresSecond}")
    private Long expiresSecond;
}
