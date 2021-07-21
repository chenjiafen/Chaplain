package com.chenjiafeng;

import com.chenjiafeng.utils.IdWorker;
import com.chenjiafeng.utils.JwtUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author chenjiafeng2
 * @create 2021-07-06 16:16
 * @desc 启动类
 **/

@SpringBootApplication
@MapperScan(basePackages = "com.chenjiafeng.dao")
public class ChaplainApplication {
    public static void main(String[] args) {
        SpringApplication.run(ChaplainApplication.class);
    }
    //将加密工具类交给Spring容器
    @Bean
    public BCryptPasswordEncoder bcryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Bean
    public IdWorker idWorkker(){
        return new IdWorker(1, 1);
    }
    @Bean
    public JwtUtil jwtUtil() {
        return new JwtUtil();
    }
}
