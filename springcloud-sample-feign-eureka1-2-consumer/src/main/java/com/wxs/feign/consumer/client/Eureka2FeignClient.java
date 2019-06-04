package com.wxs.feign.consumer.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name = "feign-eureka2-provider",url = "http://localhost:8004")
@FeignClient(name = "feign-eureka2-provider",url = "${provider2-server}")
public interface Eureka2FeignClient {

    /**
     * @return
     */
    @GetMapping("/eureka2/provider")
    public String getClients();
}
