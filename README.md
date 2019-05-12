# SCAD-HTD

19年新入职了一家电商企业，
公司开发环境目前使用的
jdk1.7，SSM等。

自己尝试为公司切换框架开发

***所有数据和核心业务均已脱敏处理，不会泄漏公司内部信息***


## 非主流框架

### Spring Cloud Alibaba Dubbo

对内 RPC，对外 REST

将 Dubbo 融入到 Spring Cloud Alibaba 生态中，
使微服务之间的调用同时具备 RESTful 和 Dubbo 调用的能力。
做到对业务代码无侵入，无感知；
引入 JAR 包则微服务间调用使用 Dubbo，去掉 JAR 包则使用默认的 RESTful；
实现参考的是 Spring Cloud 中文社区的 [Spring Cloud Dubbo](https://github.com/SpringCloud/spring-cloud-dubbo) 项目。

既然使用 Cloud Alibaba，故使用 nacos 来做 Dubbo 的注册中心。

当前时间2019.5.10 2:08,nacos 更新 1.0.0发行版。
对应的是 Spring Boot 2.x 版本





### VUE

前端采用 NodeJS + VUE + Axios 实现前后分离

随后在写吧，最近估计没时间写前端了




## 业务内容

采用领域驱动的设计模式，暂时以用户域为例，从实际角度出发完善功能




---
后记：

搭建基本框架差不多用了三天时间。即使有前人各路大牛的技术支持，但还是一路荆棘，坎坷前行。
集合多个框架开发的一大问题就是版本之间的兼容性，十分不易排查。





