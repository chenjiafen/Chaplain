package com.chenjiafeng.service;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

/**
 * @author chenjiafeng2
 * @create 2021-07-21 14:16
 * @desc
 **/
@Service
public class ExternalService {
    public JSONObject doPost(JSONObject date) {
        HttpClient client = HttpClients.createDefault();
        String url = "http://localhost:8889/admin/login";
        HttpPost post = new HttpPost(url);
        JSONObject jsonObject = null;
        try {
            StringEntity s = new StringEntity(date.toString());
            s.setContentEncoding("UTF-8");
            s.setContentType("application/json");
            post.setEntity(s);
//            post.addHeader("content-type", "text/xml");
            HttpResponse res = client.execute(post);
            String response1 = EntityUtils.toString(res.getEntity());
            System.out.println("======"+response1);
            if (res.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
//                String result = response1;// 返回json格式：
                jsonObject = JSONObject.parseObject(response1);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return jsonObject;

    }
}
