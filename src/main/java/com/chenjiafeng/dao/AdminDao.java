package com.chenjiafeng.dao;

import com.chenjiafeng.entity.Admin;

/**
 * @author chenjiafeng2
 * @create 2021-07-07 14:15
 * @desc 管理员
 **/
public interface AdminDao {
    public Admin findByLoginname(String loginname);
    public void  save(Admin admin);
}
