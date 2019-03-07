package com.wxs.eureka.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

/**
 * @Author: yoyo
 * @Description: Eureka 消费者 eureka-client作为服务提供者
 * @Date: Created in 2019/2/25 16:09
 */
@RestController
public class EurekaConsumerController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 模拟ribbon负载均衡和feign请求
     *
     * @return
     */
    @GetMapping("/consumer")
    public String getClients() {
        ServiceInstance instance = loadBalancerClient.choose("eureka-client");
        System.out.println("ServiceInstance 实现类 "+instance.getClass());
        String host = instance.getHost();
        int port = instance.getPort();
        //uri=http+host+port http://desktop-7e1ckik.mshome.net:8002/
        URI uri = instance.getUri();
        String url = host + ":" + port + ":" + uri;
        //DESKTOP-7E1CKIK.mshome.net:8002:http://DESKTOP-7E1CKIK.mshome.net:8002
        System.out.println(url);
        String result = restTemplate.getForObject(uri + "/services", String.class);
        return result;
    }
}
