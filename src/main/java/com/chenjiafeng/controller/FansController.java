package com.chenjiafeng.controller;

import com.chenjiafeng.service.FinsService;
import com.chenjiafeng.utils.Result;
import com.chenjiafeng.utils.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenjiafeng2
 * @create 2021-08-12 17:00
 * @desc 粉丝
 **/

@RestController
@RequestMapping(value = "/user")
public class FansController {
    @Autowired
    private FinsService finsService;

    @GetMapping("/follow/myfans")
    public Result findFins(){
        finsService.myfans();
        return new Result(true, StatusCode.OK, "操作成功");
    }

}
