package com.chenjiafeng.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author chenjiafeng2
 * @create 2021-08-10 16:38
 * @desc 频道
 **/

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Channel {
    String id;
    String name;
    String state;
}
