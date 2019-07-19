package com.wxs.feign.provider.controller;

import com.wxs.feign.provider.api.CustomizeFeignApi;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yoyo
 * @Description: 验证自定义feign client
 * @Date: Created in 2019/6/24 14:20
 */
@RestController
public class CustomizeFeignController implements CustomizeFeignApi {
    @Override
    public String queryCustomize() {
        return "success";
    }
}
