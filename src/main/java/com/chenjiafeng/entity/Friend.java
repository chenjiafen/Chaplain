package com.chenjiafeng.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author chenjiafeng2
 * @create 2021-08-10 16:43
 * @desc 朋友表
 **/

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Friend {
    private String userid;//用户ID
    private String friendid;//好友ID
    private String islike;//是否互相喜欢
}
