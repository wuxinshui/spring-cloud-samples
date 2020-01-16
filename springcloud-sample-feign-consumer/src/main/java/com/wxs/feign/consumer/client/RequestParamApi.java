package com.wxs.feign.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @Author: yoyo
 * @Description: 在Feign中使用@RequestParam，绑定参数，需要显示指定value的值，
 * Spring MVC会默认用参数作为value
 * @Date: Created in 2019/2/25 17:44
 */
@FeignClient(name = "feign-provider")
public interface RequestParamApi {

    @GetMapping("/request-param")
    Map getRequestParam(@RequestParam("email") String email);
}
