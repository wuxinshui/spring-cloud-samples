package com.wxs.feign.consumer.controller;

import com.wxs.feign.consumer.client.DiscoveryClientService;
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
    @Autowired
    private DiscoveryClientService discoveryClientService;

    /**
     * DiscoveryClient 获取服务列表
     *
     * @return
     */
    @GetMapping("/clients")
    public String getClients() {
        String services = "Services:" + discoveryClient.getServices();
        return services;
    }

    /**
     * 调用Feign Provider 获取服务列表
     *
     * @return
     */
    @GetMapping("/services")
    public String getServiceList() {
        return discoveryClientService.getServices();
    }
}
