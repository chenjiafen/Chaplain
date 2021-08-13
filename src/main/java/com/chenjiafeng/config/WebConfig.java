package com.chenjiafeng.config;

import com.chenjiafeng.interceptor.JwtInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author chenjiafeng2
 * @create 2021-07-20 16:54
 * @desc 自定义拦截器.配置拦截器类
 **/
@Configuration
public class WebConfig extends WebMvcConfigurationSupport {
    @Autowired
    JwtInterceptor inter;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(inter)//将Jwt拦截器添加
                .addPathPatterns("/**") //指定拦截路径
                .excludePathPatterns("/**/login");


    }
}
