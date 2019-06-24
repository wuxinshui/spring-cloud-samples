package com.wxs.feign.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yoyo
 * @Description: 验证自定义feign client
 * @Date: Created in 2019/6/24 14:20
 */
@RestController
public class CustomizeFeignController {
    @RequestMapping(value = "/customize", method = RequestMethod.GET)
    public String queryCustomize() {
        return "success";
    }
}
