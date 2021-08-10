package com.chenjiafeng.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author chenjiafeng2
 * @create 2021-08-10 16:45
 * @desc
 **/

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Nofriend {
    private String userid;//用户ID
    private String friendid;//非好友ID
}
