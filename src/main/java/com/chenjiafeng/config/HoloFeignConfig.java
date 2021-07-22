package com.chenjiafeng.config;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.net.ssl.*;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/**
 * @author chenjiafeng2
 * @create 2021-07-22 11:35
 * @desc 跳过https证书验证
 **/

//@Slf4j
//@Configuration
//public class HoloFeignConfig {
//    @Bean
//    Logger.Level deviceSendCmdFeignLoggerLevel() {
//        return Logger.Level.FULL;
//    }
//
//    @Bean
//    @ConditionalOnMissingBean
//    public Client feignClient(CachingSpringLoadBalancerFactory cachingFactory,
//                              SpringClientFactory clientFactory) throws NoSuchAlgorithmException, KeyManagementException {
//        SSLContext ctx = SSLContext.getInstance("SSL");
//        X509TrustManager tm = new X509TrustManager() {
//            @Override
//            public void checkClientTrusted(X509Certificate[] chain,
//                                           String authType) throws CertificateException {
//            }
//
//            @Override
//            public void checkServerTrusted(X509Certificate[] chain,
//                                           String authType) throws CertificateException {
//            }
//
//            @Override
//            public X509Certificate[] getAcceptedIssuers() {
//                return null;
//            }
//        };
//        ctx.init(null, new TrustManager[]{tm}, null);
//        return new LoadBalancerFeignClient(new Client.Default(ctx.getSocketFactory(),
//                new HostnameVerifier() {
//
//                    @Override
//                    public boolean verify(String hostname, SSLSession session) {
//                        // TODO Auto-generated method stub
//                        return true;
//                    }
//                }),
//                cachingFactory, clientFactory);
//    }
//
//}
