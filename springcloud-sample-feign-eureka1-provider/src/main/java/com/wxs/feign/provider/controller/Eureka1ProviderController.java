package com.wxs.feign.provider.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Eureka1ProviderController {

    /**
     * @return
     */
    @GetMapping("/eureka1/provider")
    public String getClients() {
        log.info("/eureka1/provider...");
        return "/eureka1/provider";
    }
}
