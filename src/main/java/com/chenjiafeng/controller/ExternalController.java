package com.chenjiafeng.controller;

import com.alibaba.fastjson.JSONObject;
import com.chenjiafeng.service.ExternalService;
import com.chenjiafeng.service.doPost;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.ParseException;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.ExtendedBeanInfoFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenjiafeng2
 * @create 2021-07-21 14:00
 * @desc 访问外部接口
 **/

@RestController
@RequestMapping("/ex")
@Slf4j
public class ExternalController {
    @Autowired
    ExternalService ex;

    @RequestMapping("/doPostGetJson")
    public String doPostGetJson() throws  ParseException{
        String jsonText = "{\n" +
                "    \"loginname\": \"root1\",\n" +
                "    \"password\": \"root1\"\n" +
                "}";
        JSONObject json = (JSONObject) JSONObject.parseObject(jsonText);
//        JSONObject sr = this.doPost(json);
        JSONObject jsonObject = ex.doPost(json);
        log.info("返回参数" + jsonObject);
        return jsonObject.toString();
    }
}
