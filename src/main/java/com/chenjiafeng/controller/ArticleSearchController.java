package com.chenjiafeng.controller;

import com.chenjiafeng.entity.Article;
import com.chenjiafeng.service.ArticleSearchService;
import com.chenjiafeng.utils.PageResult;
import com.chenjiafeng.utils.Result;
import com.chenjiafeng.utils.StatusCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

/**
 * @author chenjiafeng2
 * @create 2021-07-27 16:46
 * @desc
 **/
@RestController
@RequestMapping("/article")
@Slf4j
public class ArticleSearchController {
    @Autowired
    private ArticleSearchService articleSearchService;

    @RequestMapping(method = RequestMethod.POST)
    public Result save(@RequestBody Article article) {
        articleSearchService.add(article);
        return new Result(true, StatusCode.OK, "操作成功");
    }

    /**
     * 检索
     * @param keywords
     * @param page
     * @param size
     * @return
     */
    @RequestMapping(value = "/search/{keywords}/{page}/{size}", method = RequestMethod.GET)
    public Result findByTitleLike(@PathVariable String keywords, @PathVariable int page, @PathVariable int size) {
        Page<Article> articlePage = articleSearchService.findByTitleLike(keywords, page, size);
        return new Result(true, StatusCode.OK, "查询成功", new PageResult<Article>(articlePage.getTotalElements(), articlePage.getContent()));
    }
}
