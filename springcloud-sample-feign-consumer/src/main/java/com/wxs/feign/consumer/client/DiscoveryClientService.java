package com.wxs.feign.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: yoyo
 * @Description:
 * @Date: Created in 2019/2/25 17:20
 */
@FeignClient(name = "feign-provider")
public interface DiscoveryClientService {

    @GetMapping("/services")
    String getServices();
}
