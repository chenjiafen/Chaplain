package com.chenjiafeng.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @author chenjiafeng2
 * @create 2021-08-10 16:42
 * @desc 专栏
 **/

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Column {
    private String id;
    private String name;
    private String summary;
    private String userid;
    private Date createtime;//申请日期
    private Date checktime;//审核日期
    private String state; //状态
}
