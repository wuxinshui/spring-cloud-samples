package com.wxs.feign.provider.api;

import com.netflix.ribbon.proxy.annotation.CacheProvider;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: yoyo
 * @Description:
 * @Date: Created in 2019/6/24 14:18
 */
//@FeignClient(name = "feign-provider")
public interface CustomizeFeignApi {

    @RequestMapping(value = "/customize", method = RequestMethod.GET)
    String queryCustomize();
}
