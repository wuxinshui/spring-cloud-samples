package com.wxs.feign.consumer.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

/**
 * @Author: yoyo
 * @Description:
 * @Date: Created in 2019/2/25 17:44
 */
@FeignClient(name = "feign-provider")
public interface HeadAcceptService {

    @GetMapping("/head/accept")
    String postEmailByHeader(@RequestHeader("email") String email);
}
