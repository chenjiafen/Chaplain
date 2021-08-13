package com.chenjiafeng.service;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.HttpHead;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chenjiafeng2
 * @create 2021-07-21 14:14
 * @desc
 **/
@Service
public class doPost {
    @Autowired
    private RestTemplate restTemplate;
    public String getToken(){
        return restTemplate.getForObject("http://localhost:8889/ex/doPostGetJson",String.class);
    }
    public String postLogin(String name ,String pass ){
////        HttpHead headers=new HttpHead();
////        headers.setHeader(HttpHeaders.CONTENT_TYPE," application/json; charset=UTF-8");
//        HashMap<Object, Object> map = new HashMap<>();
//        map.put("Content-Type","application/json");
        String url="http://localhost:8889/admin";
//        JSONObject obj = new JSONObject();//放入body中的json参数
//        obj.put("loginname", name);
//        obj.put("password", pass);
////        HttpEntity<Object,Object> request = new HttpEntity<JSONObject, MultiValueMap>(obj,map);


        MultiValueMap<String, Object> paramMap = new LinkedMultiValueMap<String, Object>();
        paramMap.add("loginname", name);
        paramMap.add("password", pass);
        String result = restTemplate.postForObject(url, paramMap, String.class);
        return result;
    }
}
