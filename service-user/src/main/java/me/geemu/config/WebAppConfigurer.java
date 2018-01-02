package me.geemu.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author Geemu
 * Email: cfmmail@sina.com
 * Date: 2017/12/5 10:38
 * Description: 过滤器
 */
@Configuration
public class WebAppConfigurer extends WebMvcConfigurerAdapter {


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(null)
//                .addPathPatterns("/user/password")
//
//
//        //排除这些路径
////                .excludePathPatterns("/usr/login_quick")
//
//        ;
//        super.addInterceptors(registry);
    }
}