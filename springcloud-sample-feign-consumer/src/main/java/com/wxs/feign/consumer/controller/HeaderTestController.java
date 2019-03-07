package com.wxs.feign.consumer.controller;

import com.wxs.feign.consumer.client.HeadAcceptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yoyo
 * @Description:
 * @Date: Created in 2019/2/25 17:46
 */
@RestController
public class HeaderTestController {


    @Autowired
    private HeadAcceptService headAcceptService;

    /**
     * 调用Feign Provider 传递header
     *
     * @return
     */
    @GetMapping("/header/{email}")
    public String getServiceList(@PathVariable("email")String email) {
        return headAcceptService.postEmailByHeader(email);
    }
}
