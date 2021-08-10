package com.chenjiafeng.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @author chenjiafeng2
 * @create 2021-08-10 16:50
 * @desc 用户关注活动
 **/

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Usergath {
    private String userid;
    private String gathid;
    private Date exetime;

}
