package me.geemu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: Geemu
 * Email:cfmmail@sina.com
 * Date: 2017/12/4 16:17
 * Description:
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServer.class, args);
	}

}
