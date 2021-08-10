package com.chenjiafeng.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author chenjiafeng2
 * @create 2021-08-10 16:44
 * @desc 标签
 **/

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Label {
    private String id;
    private String labelname;//标签名称
    private String state;//状态
    private Integer count;//使用数量
    private String recommend;//是否推荐
    private Integer fans;//粉丝数
}
