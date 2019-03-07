package com.wxs.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


/**
 * Eureka 客户端
 * @author DELL
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaConsumerApplication {

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(EurekaConsumerApplication.class, args);
	}

}
