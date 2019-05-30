package com.wxs.feign.provider.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Eureka2ProviderController {

    /**
     * @return
     */
    @GetMapping("/eureka2/provider")
    public String getClients() {
        log.info("/eureka2/provider...");
        return "/eureka2/provider";
    }
}
