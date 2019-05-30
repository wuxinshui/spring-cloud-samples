package com.wxs.feign.consumer.controller;

import com.wxs.feign.consumer.client.Eureka1FeignClient;
import com.wxs.feign.consumer.client.Eureka2FeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.StringJoiner;

@RestController
public class DifferentEurekaTestController {

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
        String resutl1=eureka1FeignClient.getClients();
        String resutl2=eureka2FeignClient.getClients();
        return resutl1+""+resutl2;
    }
}
