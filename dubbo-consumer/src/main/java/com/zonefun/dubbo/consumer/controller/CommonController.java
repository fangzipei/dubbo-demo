package com.zonefun.dubbo.consumer.controller;

import com.alibaba.fastjson2.JSONObject;
import com.zonefun.dubbo.consumer.service.IConsumerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName CommonController
 * @Description 通用开放接口
 * @Date 2023/3/2010:46
 * @Author ZoneFang
 */
@RestController
@Slf4j
@RequestMapping("/api")
public class CommonController {
    @Autowired
    IConsumerService consumerService;

    @GetMapping("/sayHai")
    @ResponseBody
    public Object sayHai() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("str", consumerService.printHello());
        return jsonObject;
    }
}
