package com.wxs.feign.consumer.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: yoyo
 * @Description:
 * @Date: Created in 2019/6/24 14:18
 */
@FeignClient(name = "feign-provider")
public interface CustomizeFeignApi {

    @RequestMapping(value = "/customize", method = RequestMethod.GET)
    String queryCustomize();
}
