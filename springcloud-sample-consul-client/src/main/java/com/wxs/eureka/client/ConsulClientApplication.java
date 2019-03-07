package com.wxs.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.consul.ConditionalOnConsulEnabled;


/**
 * Eureka 客户端
 * @author DELL
 */
@SpringBootApplication
public class ConsulClientApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ConsulClientApplication.class, args);
	}

}
