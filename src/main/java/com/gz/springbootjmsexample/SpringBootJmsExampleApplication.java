package com.gz.springbootjmsexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.core.JmsTemplate;

/**
 * 消息发送及目的地定义
 *
 * @author xiaozefeng
 */
@SpringBootApplication
public class SpringBootJmsExampleApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJmsExampleApplication.class, args);
    }

    @Autowired
    private JmsTemplate jmsTemplate;

    /**
     * Spring Boot 提供了CommandLineRunner 接口， 用于程序启动后执行的代码, 通过重写run方法支持
     * @param strings
     * @throws Exception
     */
    @Override
    public void run(String... strings) throws Exception {
        // my-destination 是消息代理上定义了一个目的地
        jmsTemplate.send("my-destination", new Msg());
    }
}
