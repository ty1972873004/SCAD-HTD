## 核心

又想 http 通信，又想 rpc 通信。


Dubbo | 实现方式
--- | ---
Provider | @Service
Consumer | @Reference

Spring Cloud Alibaba | 实现方式
--- | ---
Feign(HttpClient) | @FeignClient

思考方向，将不同框架的注解合二为一

面向修改关闭，面向扩展开放（DubboFeignBuilder）

```
@ConditionalOnProperty(prefix = DUBBO_PREFIX, name = "enabled", matchIfMissing = true, havingValue = "true")
@ConditionalOnClass(AbstractConfig.class)
```

有 Dubbo 依赖则生效，没有 Dubbo 以来则不生效，只使用 Cloud




