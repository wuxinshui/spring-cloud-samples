## 验证场景
消费者请求不同注册中心的服务。
## 服务提供者

springcloud-sample-feign-eureka1-provider -> 注册到 eureka1

springcloud-sample-feign-eureka2-provider -> 注册到 eureka2

## 服务消费者

springcloud-sample-feign-eureka1-2-consumer -> 注册到eureka1
1. 通过feign client url 访问 eureka2的服务。
2. URL 地址实现placeholder注入