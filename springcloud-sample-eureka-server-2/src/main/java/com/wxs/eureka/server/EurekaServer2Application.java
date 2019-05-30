package com.wxs.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka 注册中心
 * @author DELL
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer2Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(EurekaServer2Application.class, args);
	}

}
