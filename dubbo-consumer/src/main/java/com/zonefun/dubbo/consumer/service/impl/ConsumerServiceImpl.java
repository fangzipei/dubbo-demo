package com.zonefun.dubbo.consumer.service.impl;

import com.zonefun.dubbo.demo.service.ICommonService;
import com.zonefun.dubbo.consumer.service.IConsumerService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName ConsumerServiceImpl
 * @Description 消费者Service实现类
 * @Date 2023/3/2010:22
 * @Author ZoneFang
 */
@Service
public class ConsumerServiceImpl implements IConsumerService {

    @DubboReference
    ICommonService commonService;

    @Override
    public String printHello() {
        return commonService.sayHi();
    }
}
