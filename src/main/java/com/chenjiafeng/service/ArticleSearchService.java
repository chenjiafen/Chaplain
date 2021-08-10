package com.chenjiafeng.service;

import com.chenjiafeng.dao.ArticleSearchDao;
import com.chenjiafeng.entity.Article;
import com.chenjiafeng.utils.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

/**
 * @author chenjiafeng2
 * @create 2021-07-27 16:35
 * @desc
 **/
@Service
public class ArticleSearchService {
    @Autowired
    private ArticleSearchDao articleSearchDao;
    @Autowired
    IdWorker idWorker;

    /*** 增加文章 * @param article */
    public void add(Article article) {
        article.setId(idWorker.nextId() + "");
        articleSearchDao.save(article);
    }

    /**
     * 检索
     *
     * @param keywords
     * @param page
     * @param size
     * @return
     */
    public Page<Article> findByTitleLike(String keywords, int page, int size) {
        PageRequest pageRequest = PageRequest.of(page - 1, size);
        return articleSearchDao.findByTitleOrContentLike(keywords, keywords, (Pageable) pageRequest);
    }
}
