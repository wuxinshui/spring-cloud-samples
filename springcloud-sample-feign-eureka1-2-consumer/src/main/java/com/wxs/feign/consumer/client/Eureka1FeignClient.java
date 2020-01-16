package com.wxs.feign.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "feign-eureka1-provider")
public interface Eureka1FeignClient {

    /**
     * @return
     */
    @GetMapping("/eureka1/provider")
    String getClients();
}
