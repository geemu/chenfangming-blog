package me.geemu.config;

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
    @Value("${audience.clientId}")
    private String clientId;
    @Value("${audience.base64Secret}")
    private String base64Secret;
    @Value("${audience.name}")
    private String name;
    /**
     * 有效时长
     */
    @Value("${audience.expiresSecond}")
    private Long expiresSecond;
}
