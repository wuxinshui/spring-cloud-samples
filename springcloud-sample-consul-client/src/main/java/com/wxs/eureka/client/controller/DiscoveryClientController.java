package com.wxs.eureka.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yoyo
 * @Description:
 * @Date: Created in 2019/2/25 16:09
 */
@RestController
public class DiscoveryClientController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/services")
    public String getClients() {
        String services = "Services:" + discoveryClient.getServices();
        return services;
    }
}
