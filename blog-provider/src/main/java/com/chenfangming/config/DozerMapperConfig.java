package com.chenfangming.config;

import org.dozer.spring.DozerBeanMapperFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Geemu
 * Email: cfmmail@sina.com
 * Date: 2018/1/9  11:29
 * Description: com.chenfangming.config
 */
@Configuration
public class DozerMapperConfig {
    @Bean("mapper")
    public DozerBeanMapperFactoryBean mapper() {
        return new DozerBeanMapperFactoryBean();
    }
}
