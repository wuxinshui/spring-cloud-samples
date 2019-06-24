package com.wxs.feign.provider.config;

import com.wxs.feign.provider.api.CustomizeFeignApi;
import feign.Contract;
import feign.Feign;
import feign.codec.Decoder;
import feign.codec.Encoder;
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
@Import(FeignClientsConfiguration.class)
public class FeignClientConfig {

    /**
     * org.springframework.cloud.netflix.feign.FeignClientsConfiguration 创建，参数自动注入
     *
     * @param contract
     * @param decoder
     * @param encoder
     * @return
     */
    @Bean
    public CustomizeFeignApi customizeFeignApi(Contract contract, Decoder decoder, Encoder encoder) {
        if (contract instanceof Contract.Default) {
            contract = new SpringMvcContract();
        }
        return Feign.builder().contract(contract).encoder(encoder).decoder(decoder).target(CustomizeFeignApi.class, "http://localhost:8004");
        //return Feign.builder().contract(new SpringMvcContract()).target(CustomizeFeignApi.class, "http://localhost:8004");
        //return Feign.builder().target(CustomizeFeignApi.class, "http://localhost:8004");
    }

}
