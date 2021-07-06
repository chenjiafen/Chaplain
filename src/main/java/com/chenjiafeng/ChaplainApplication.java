package com.chenjiafeng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
}
