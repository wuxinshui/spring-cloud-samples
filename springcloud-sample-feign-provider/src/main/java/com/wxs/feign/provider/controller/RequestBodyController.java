package com.wxs.feign.provider.controller;

import com.wxs.feign.provider.vo.UserVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author: yoyo
 * @Description: Feign : Head参数传递测试
 * @Date: Created in 2019/2/25 17:38
 */
@RestController
@Slf4j
public class RequestBodyController {

    /**
     * 接收传递的RequestParam
     *
     * @param userVo
     * @return
     */
    @PostMapping("/request-body")
    public Map getRequestBody(@RequestBody UserVo userVo) {
        log.info("request-body userVo is {}", userVo);
        return Map.of("code", "200", "msg", "success", "data", userVo);
    }


}
