package com.wxs.feign.consumer.config;

import com.wxs.feign.consumer.client.CustomizeFeignApi;
import feign.Client;
import feign.Feign;
import org.springframework.cloud.netflix.feign.FeignClientsConfiguration;
import org.springframework.cloud.netflix.feign.support.SpringMvcContract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author: yoyo
 * @Description:
 * @Date: Created in 2019/6/24 14:16
 */
@Configuration
//@Import(FeignClientsConfiguration.class)
public class FeignClientConfig {

    @Bean
    public CustomizeFeignApi customizeFeignApi(Client client) {
        return Feign.builder().contract(new SpringMvcContract()).target(CustomizeFeignApi.class, "http://localhost:8004");
        //return Feign.builder().target(CustomizeFeignApi.class, "http://localhost:8004");
    }

}
