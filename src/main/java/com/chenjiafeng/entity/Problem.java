package com.chenjiafeng.entity;

import java.util.Date;

/**
 * @author chenjiafeng2
 * @create 2021-08-10 16:47
 * @desc 问题
 **/
public class Problem {

    private String id;
    private String title;//标题
    private String content;//内容
    private Date createtime;//创建日期
    private Date updatetime;//修改日期
    private String userid;//用户ID
    private String nickname;//昵称
    private Integer visits;//浏览量
    private Integer thumbup;//点赞数
    private Integer reply;//回复数
    private String solve;//是否解决
    private String replyname;//回复人昵称
    private Date replytime;//回复日期

}
