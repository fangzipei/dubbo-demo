package com.zonefun.dubbo.demo.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName com.zonefun.dubbo.demo.provider.DubboProviderApplication
 * @Description provider启动类
 * @Date 2023/3/17 17:20
 * @Author ZoneFang
 */
@SpringBootApplication
@EnableDubbo
public class DubboProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApplication.class, args);
    }
}
