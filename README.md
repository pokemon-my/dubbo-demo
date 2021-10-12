# dubbo-demo
这是一个使用zookeeper注册中心的一个dubbo项目；

## Spring集成dubbo
001-link-userservice-provider和002-link-consumer是dubbo直连项目，没有用到zookeeper  
Tomcat采用自己下载的tomecat，有类似spring项目启动可以参考Tomcat配置

## Springboot集成dubbo和Zookeeper
003-link-dubbo-interface  接口服务，是一个纯maven工程  
004-registry-dubbo-provider 服务提供者，web工程  
005-registry-dubbo-consumer 服务消费者，web工程  
