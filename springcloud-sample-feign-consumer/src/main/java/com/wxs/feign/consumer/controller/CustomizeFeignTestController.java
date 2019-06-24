package com.wxs.feign.consumer.controller;

import com.wxs.feign.consumer.client.CustomizeFeignApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yoyo
 * @Description: 验证自定义feign client
 * @Date: Created in 2019/6/24 14:20
 */
@RestController
public class CustomizeFeignTestController {
    @Autowired
    private CustomizeFeignApi customizeFeignApi;

    @GetMapping("/customize")
    public String query() {
        return customizeFeignApi.queryCustomize();
    }
}
