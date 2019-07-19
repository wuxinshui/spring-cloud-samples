package com.wxs.feign.provider.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
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
public class RequestParamController {

    /**
     * 接收传递的RequestParam
     *
     * @param email
     * @return
     */
    @GetMapping("/request-param")
    public Map getRequestParam(@RequestParam("email") String email) {
        log.info("request-param email is {}", email);
        return Map.of("code", "200", "msg", "success", "data", Map.of("email", email));

    }
}
