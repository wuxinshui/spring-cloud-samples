package com.wxs.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


/**
 * Feign 服务消费者
 *
 * @author DELL
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ApiGatewayZuulApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ApiGatewayZuulApplication.class, args);
    }


}
