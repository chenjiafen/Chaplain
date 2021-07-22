package com.chenjiafeng.controller;

import com.alibaba.fastjson.JSONObject;
import com.chenjiafeng.entity.User;
import com.chenjiafeng.service.ExternalService;
import com.chenjiafeng.utils.Result;
import com.chenjiafeng.utils.StatusCode;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpHeaders;
import org.apache.http.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


/**
 * @author chenjiafeng2
 * @create 2021-07-21 14:00
 * @desc 访问外部接口
 **/

@RestController
@RequestMapping(value = "/ex")
@Slf4j
public class ExternalController {
    @Autowired
    ExternalService ex;

    //    @Autowired
//    CloudUserFeignClient cloudUserFeignClient;
    @RequestMapping(value = "/doPostGetJson", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public String doPostGetJson() throws ParseException {
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

    //    @PostMapping(value = "/test")
//    public Result getClient(@RequestBody User user){
//        JSONObject token = cloudUserFeignClient.getToken(user);
//        return  new Result(true, StatusCode.OK,"查询成功",token);
//    }
//    @PostMapping(value = "/test01")
//    public Result getClient01(@RequestBody User user) {
//        final String uri = "http://localhost:8080/springrestexample/employees";
//        RestTemplate restTemplate = new RestTemplate();
//        HttpHeaders headers = new HttpHeaders();
//        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
//
//        ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);
//
//        System.out.println(result);
//        return  null;
//    }
}
