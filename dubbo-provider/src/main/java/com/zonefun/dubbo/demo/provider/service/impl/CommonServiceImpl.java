package com.zonefun.dubbo.demo.provider.service.impl;

import com.zonefun.dubbo.demo.service.ICommonService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @ClassName CommonServiceImpl
 * @Description 通用Service实现类
 * @Date 2023/3/17 17:18
 * @Author ZoneFang
 */
@DubboService
public class CommonServiceImpl implements ICommonService {
    @Override
    public String sayHi() {
        return "Hello world!";
    }
}
