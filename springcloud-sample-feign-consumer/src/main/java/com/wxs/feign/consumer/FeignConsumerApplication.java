package com.wxs.feign.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


/**
 * Feign 服务消费者
 *
 * @author DELL
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@ComponentScan("com.wxs.feign.consumer")
public class FeignConsumerApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(FeignConsumerApplication.class, args);
    }

}
