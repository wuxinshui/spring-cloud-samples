package com.wxs.feign.consumer.config;

import com.wxs.feign.consumer.client.CustomizeFeignApi;
import feign.Contract;
import feign.Feign;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: yoyo
 * @Description:
 * @Date: Created in 2019/6/24 14:16
 */
@Configuration
public class FeignClientConfig {

    @Bean
    public CustomizeFeignApi customizeFeignApi() {
        Contract contract = new Contract.Default();
        return Feign.builder().contract(contract).target(CustomizeFeignApi.class, "http://localhost:8004");
    }

}
