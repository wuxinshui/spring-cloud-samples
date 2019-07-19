package com.wxs.feign.provider.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author: yoyo
 * @Description: Feign : Head参数传递测试
 * @Date: Created in 2019/2/25 17:38
 */
@RestController
@Slf4j
public class PathVariableController {

    /**
     * 接收传递的RequestParam
     *
     * @param value
     * @return
     */
    @GetMapping("/path/{value}")
    public Map getRequestParam(@PathVariable("value") String value) {
        log.info("request-param value is {}", value);
        return Map.of("code", "200", "msg", "success", "data", Map.of("value", value));

    }
}
