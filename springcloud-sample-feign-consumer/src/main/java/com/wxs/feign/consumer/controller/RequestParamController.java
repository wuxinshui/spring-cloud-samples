package com.wxs.feign.consumer.controller;

import com.wxs.feign.consumer.client.RequestParamApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author: yoyo
 * @Description:
 * @Date: Created in 2019/6/12 11:01
 */
@RestController
public class RequestParamController {
    @Autowired
    private RequestParamApi requestParamApi;

    @GetMapping("/param")
    public Map getParam(@RequestParam("email") String email) {
        return requestParamApi.getRequestParam(email);
    }
}
