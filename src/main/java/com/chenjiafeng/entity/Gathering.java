package com.chenjiafeng.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author chenjiafeng2
 * @create 2021-07-05 18:06
 * @desc 实体类
 **/

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Gathering {
    private String id;//编号
    private String name;//活动名称
    private String summary;//大会简介
    private String detail;//详细说明
    private String sponsor;//主办方
    private String image;//活动图片
    private java.util.Date starttime;//开始时间
    private java.util.Date endtime;//截止时间
    private String address;//举办地点
    private java.util.Date enrolltime;//报名截止
    private String state;//是否可见
    private String city;//城市
}
