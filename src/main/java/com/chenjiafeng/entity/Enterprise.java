package com.chenjiafeng.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author chenjiafeng2
 * @create 2021-08-10 16:43
 * @desc 企业
 **/
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Enterprise {
    private String id;
    private String name;//企业名称
    private String summary;//企业简介
    private String address;//企业地址
    private String labels;//标签列表
    private String coordinate;//坐标
    private String ishot;//是否热门
    private String logo;
    private Integer jobcount;//职位数
    private String url;

}
