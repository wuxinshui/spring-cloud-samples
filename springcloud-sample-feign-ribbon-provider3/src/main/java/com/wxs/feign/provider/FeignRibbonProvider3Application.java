package com.wxs.feign.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * Feign 服务提供者
 *
 * @author DELL
 */
@SpringBootApplication
@EnableEurekaClient
public class FeignRibbonProvider3Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(FeignRibbonProvider3Application.class, args);
    }

}
