package com.wxs.feign.consumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yoyo
 * @Description:
 * @Date: Created in 2020/1/16 16:02
 */
@RestController
@RequestMapping("/ribbon-timeout")
public class RibbonTimeoutController {

    @GetMapping("/test")
    public String test() {
        return "success";
    }
}
