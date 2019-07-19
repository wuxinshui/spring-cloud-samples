package com.wxs.feign.consumer.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @Author: yoyo
 * @Description:
 * @Date: Created in 2019/7/19 11:58
 */
@FeignClient(name = "feign-provider")
public interface PathVariableApi {
    @GetMapping("/path/{value}/test")
    public Map getRequestParam(@PathVariable("value") String value, @RequestParam("param") String param);
}
