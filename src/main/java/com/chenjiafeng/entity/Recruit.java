package com.chenjiafeng.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author chenjiafeng2
 * @create 2021-08-10 16:48
 * @desc 职位
 **/

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Recruit {
    private String id;
    private String jobname;
    private String salary;
    private String condition;
    private String education;
    private String type;
    private String address;
    private String eid;
    private String createtime;
    private String state;
    private String url;
    private String label;
    private String content1;
    private String content2;

}
