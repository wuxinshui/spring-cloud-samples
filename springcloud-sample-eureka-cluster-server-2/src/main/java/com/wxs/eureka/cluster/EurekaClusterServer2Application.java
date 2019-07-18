package com.wxs.eureka.cluster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka 注册中心
 * @author DELL
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaClusterServer2Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(EurekaClusterServer2Application.class, args);
	}

}
