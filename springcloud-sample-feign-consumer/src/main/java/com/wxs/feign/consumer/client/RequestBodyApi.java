package com.wxs.feign.consumer.client;

import com.wxs.feign.consumer.vo.UserVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

/**
 * @Author: yoyo
 * @Description:
 * @Date: Created in 2019/2/25 17:44
 */
@FeignClient(name = "feign-provider")
public interface RequestBodyApi {

    @PostMapping("/request-body")
    Map getRequestBody(@RequestBody UserVo userVo);
}
