# SCAD-HTD

19年新入职了一家电商企业，
公司开发环境目前使用的
jdk1.7，SSM等。

自己尝试为公司切换框架开发

>所有数据和核心业务均已脱敏处理，不会泄漏公司内部信息


## 确认框架

### Spring Cloud Alibaba Dubbo

对内 RPC，对外 REST

将 Dubbo 融入到 Spring Cloud Alibaba 生态中，
使微服务之间的调用同时具备 RESTful 和 Dubbo 调用的能力。
做到对业务代码无侵入，无感知；
引入 JAR 包则微服务间调用使用 Dubbo，去掉 JAR 包则使用默认的 RESTful；
实现参考的是 Spring Cloud 中文社区的 [Spring Cloud Dubbo](https://github.com/SpringCloud/spring-cloud-dubbo) 项目。

为简便开发，ORM 持久层使用 Mybatis-Plus

### VUE

前端采用 NodeJS + VUE + Axios 实现前后分离








## 业务内容

采用领域驱动的设计模式，暂时以用户域为例，从实际角度出发










