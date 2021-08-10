package com.chenjiafeng.dao;

import com.chenjiafeng.entity.Article;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;

/**
 * @author chenjiafeng2
 * @create 2021-07-27 16:24
 * @desc
 **/
public interface ArticleSearchDao {
    void save(Article article);


    /**
     * 检索
     * @param title
     * @param content
     * @param pageable
     * @return
     */
    Page<Article> findByTitleOrContentLike(String title, String content, Pageable pageable);
}
