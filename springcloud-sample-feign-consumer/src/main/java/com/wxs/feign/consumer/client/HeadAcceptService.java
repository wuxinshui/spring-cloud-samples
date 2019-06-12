package com.wxs.feign.consumer.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

/**
 * @Author: yoyo
 * @Description: 在Feign中使用@RequestHeader，绑定参数，需要显示指定value的值，
 * 在Spring MVC 中会默认用参数作为value
 * @Date: Created in 2019/2/25 17:44
 */
@FeignClient(name = "feign-provider")
public interface HeadAcceptService {

    @GetMapping("/head/accept")
    String postEmailByHeader(@RequestHeader("email") String email);
}
