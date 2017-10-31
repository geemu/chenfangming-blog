package me.geemu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Author: geemu
 * Email: cfmmail@sina.com
 * Date: 2017/10/14 12:30
 * Description: 注册中心
 */
@EnableEurekaServer        // 注解：启动一个服务注册中心提供给其他应用进行对话
@SpringBootApplication
public class RegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegisterApplication.class, args);
    }
}
