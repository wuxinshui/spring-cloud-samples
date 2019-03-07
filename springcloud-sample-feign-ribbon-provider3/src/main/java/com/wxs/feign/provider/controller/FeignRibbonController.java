package com.wxs.feign.provider.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yoyo
 * @Description: ribbon负载均衡测试
 * @Date: Created in 2019/2/25 16:09
 */
@RestController
@Slf4j
public class FeignRibbonController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/services")
    public String getClients() {
        log.info("feign ribbon provider3..........");
        String services = "Services:" + discoveryClient.getServices();
        return services;
    }
}
