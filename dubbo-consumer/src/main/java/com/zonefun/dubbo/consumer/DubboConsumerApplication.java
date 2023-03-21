package com.zonefun.dubbo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName com.zonefun.dubbo.consumer.DubboConsumerApplication
 * @Description 服务消费者启动类
 * @Date 2023/3/17 17:22
 * @Author ZoneFang
 */
@SpringBootApplication
public class DubboConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerApplication.class, args);
    }
}
