package com.wxs.feign.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


/**
 * Feign 服务消费者
 * @author DELL
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class Eureka12FeignConsumerApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Eureka12FeignConsumerApplication.class, args);
	}

}
