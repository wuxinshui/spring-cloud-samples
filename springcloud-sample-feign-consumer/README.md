# 知识点

## DiscoveryClient

## Feign

在Feign中使用@RequestHeader、@RequestParam等可以指定参数名称的注解，需要显示指定value的值，才能绑定参数。
在Spring MVC 中不用显示指定value，会默认用参数作为value

### Feign-@RequestParam
### Feign-@RequestHeader
### Feign-@RequestBody
### Feign 日志

- 手动创建的`FeignClient`，需要指定Logger,Logger.Level
- 自动创建的只需要指定api path

```
logging:
  level:
    com.wxs.feign.provider.api.CustomizeFeignApi: debug
    com.wxs.feign.consumer.client.HeadAcceptService: debug
```

## Configuration
- ribbon ReadTimeout
- ribbon ConnectionTimeout

## [Creating Feign Clients Manually](https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-feign.html)

[Feign: Method not annotated with HTTP method type (ex. GET, POST)](https://github.com/spring-cloud/spring-cloud-netflix/issues/760
)

## SPI

## QA check

### java.lang.IllegalArgumentException: Illegal character in path at index 28:
[Feign does not support @PathVariable for path at @FeignClient ](https://github.com/spring-cloud/spring-cloud-netflix/issues/2406)
