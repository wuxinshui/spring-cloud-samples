package com.wxs.feign.consumer.controller;

import com.wxs.feign.consumer.client.Eureka1FeignClient;
import com.wxs.feign.consumer.client.Eureka2FeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DifferentEurekaTestController {

    private static Logger logger = LoggerFactory.getLogger(DifferentEurekaTestController.class);

    @Autowired
    private Eureka1FeignClient eureka1FeignClient;
    @Autowired
    private Eureka2FeignClient eureka2FeignClient;


    /**
     * 调用Feign Provider 传递header
     *
     * @return
     */
    @GetMapping("differ-eureka")
    public String getServiceList() {
        logger.info("consumer ask eureka1 provider1...");
        String resutl1 = eureka1FeignClient.getClients();
        logger.info("consumer ask eureka1 provider1...end");
        logger.info("consumer ask eureka2 provider2...");
        String resutl2 = eureka2FeignClient.getClients();
        logger.info("consumer ask eureka2 provider2...end");
        return resutl1 + "" + resutl2;
    }
}
