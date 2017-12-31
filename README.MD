# Spring Boot JMS Example

## Docker 安装ActiveMQ
``` bash
    docker run -d -p 61616:61616 -p 8161:8161 cloudesire/activemq
```

## 基本步骤
1. 定义消息
2. 消息发送及目的地设置
3. 消息接受