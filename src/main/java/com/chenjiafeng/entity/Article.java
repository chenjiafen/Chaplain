package com.chenjiafeng.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import java.io.Serializable;

/**
 * @author chenjiafeng2
 * @create 2021-07-27 16:19
 * @desc
 **/
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "tensquare", type = "article")
public class Article implements Serializable {
    @Id
    private String id;
    @Field(index = true, analyzer = "ik_max_word", searchAnalyzer = "ik_max_word")
    private String title;//标题
    @Field(index = true, analyzer = "ik_max_word", searchAnalyzer = "ik_max_word")
    private String content;//文章正文
    private String state;//审核状态
}
