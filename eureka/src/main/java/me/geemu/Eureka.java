package me.geemu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: Geemu
 * Email:cfmmail@sina.com
 * Date: 2017/12/5 4:34
 * Description:
 */
@EnableEurekaServer
@SpringBootApplication
public class Eureka {

	public static void main(String[] args) {
		SpringApplication.run(Eureka.class, args);
	}

}
