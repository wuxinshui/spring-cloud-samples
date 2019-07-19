package com.wxs.feign.provider.controller;

import com.netflix.ribbon.proxy.annotation.Http;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yoyo
 * @Description: Feign : Head参数传递测试
 * @Date: Created in 2019/2/25 17:38
 */
@RestController
@Slf4j
public class HeadAcceptController {
    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * 接收传递的header
     * @param email
     * @return
     */
    @GetMapping("/head/accept")
    public String getClients(@RequestHeader("email") String email) {
        log.info("header email is {}",email);
        String services = "Services:" + discoveryClient.getServices();
        return services+"email: "+email;
    }
}
