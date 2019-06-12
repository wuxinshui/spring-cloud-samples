package com.wxs.feign.consumer.controller;

import com.wxs.feign.consumer.client.RequestBodyApi;
import com.wxs.feign.consumer.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @Author: yoyo
 * @Description:
 * @Date: Created in 2019/6/12 11:01
 */
@RestController
public class RequestBodyController {
    @Autowired
    private RequestBodyApi requestBodyApi;

    @PostMapping("/body")
    public Map getBody(@RequestBody UserVo userVo) {
        return requestBodyApi.getRequestBody(userVo);
    }
}
