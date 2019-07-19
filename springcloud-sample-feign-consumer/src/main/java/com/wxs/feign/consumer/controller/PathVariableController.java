package com.wxs.feign.consumer.controller;

import com.wxs.feign.consumer.client.PathVariableApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author: yoyo
 * @Description: Feign : PathVariable参数传递测试
 * @Date: Created in 2019/2/25 17:38
 *
 *
 *  read:https://github.com/spring-cloud/spring-cloud-netflix/issues/2406
 */
@RestController
public class PathVariableController {

    @Autowired
    private PathVariableApi pathVariableApi;


    /**
     * PathVariable
     *
     * @param value
     * @return
     */
    @GetMapping("/path/{value}")
    public Map getRequestParam(@PathVariable("value") String value) {
        return pathVariableApi.getRequestParam(value,"GGGGGGGGGGGGGG");
        //return null;
    }
}
