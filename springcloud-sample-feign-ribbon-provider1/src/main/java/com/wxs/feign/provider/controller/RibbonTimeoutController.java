package com.wxs.feign.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * @Author: yoyo
 * @Description:
 * @Date: Created in 2020/1/16 16:02
 */
@RestController
@RequestMapping("/ribbon-timeout")
public class RibbonTimeoutController {

    @GetMapping("/test")
    public String test() throws InterruptedException {
        long start = LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli();

        System.out.println("----------------Sleep Start" + System.nanoTime());
        Thread.sleep(20);
        System.out.println("----------------Sleep End" + System.nanoTime());
        long end = LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli();
        System.out.println(" cost time:" + (end - start));

        return "success";
    }
}
