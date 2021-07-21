package com.chenjiafeng.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author chenjiafeng2
 * @create 2021-07-07 13:57
 * @desc 管理员库
 **/
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
    private String id;
    private String loginname;
    private String password;
    private String state;


}
