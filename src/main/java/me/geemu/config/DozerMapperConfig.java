package me.geemu.config;

import org.dozer.spring.DozerBeanMapperFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Geemu
 * Email: cfmmail@sina.com
 * Date: 2017/12/5 10:38
 * Description: 拷贝
 */
@Configuration
public class DozerMapperConfig {
    /**
     * @return 对象拷贝
     */
    @Bean("mapper")
    public DozerBeanMapperFactoryBean mapper() {
        return new DozerBeanMapperFactoryBean();
    }


}
