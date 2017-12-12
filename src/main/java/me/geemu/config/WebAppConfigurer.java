package me.geemu.config;

import me.geemu.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Author: Geemu
 * Email:cfmmail@sina.com
 * Date: 2017/12/5 10:38
 * Description:
 */
@Configuration
public class WebAppConfigurer extends WebMvcConfigurerAdapter {

    @Autowired
    LoginInterceptor loginRequestInterceptor;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginRequestInterceptor)
                .addPathPatterns("/user/password")


        //排除这些路径
//                .excludePathPatterns("/usr/login_quick")

        ;
        super.addInterceptors(registry);
    }
}