package me.geemu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author geemu
 * Email：cfmmail@sina.com
 * Date：2017/10/10 17:16
 * Despriction：程序入口
 */
@SpringBootApplication
@EnableEurekaClient
public class PassToolApplication {

    public static void main(String[] args) {
        SpringApplication.run(PassToolApplication.class, args);
    }
}
