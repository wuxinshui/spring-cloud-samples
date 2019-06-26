# 知识点

## 路由
### 传统路由

```groovy
zuul.routes.<route>.path
zuul.routes.<route>.url
```

实例：

```groovy
zuul.routes.feign-consumer.path = /feign-consumer/**
zuul.routes.feign-consumer.url = http://localhost:9080
```

### 服务路由
1.格式1

```groovy
zuul.routes.<serviceId>.path=<path>
zuul.routes.<serviceId>.serviceId=<serviceId>
```
实例：
```groovy
zuul.routes.feign-consumer.path=/feign-consumer/**
zuul.routes.feign-consumer.serviceId=feign-consumer
```

2.格式2

`zuul.routes.<serviceId> = <path>
`

实例：
`zuul.routes.feign-consumer = /consumer/**
`

默认为注册中心所有的服务，创建服务路由。

`http://localhost:8000/feign-provider/services`

## 过滤



