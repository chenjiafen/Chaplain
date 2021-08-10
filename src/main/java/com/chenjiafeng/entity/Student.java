package com.chenjiafeng.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.io.Serializable;
import java.util.List;

/**
 * @author chenjiafeng2
 * @create 2021-07-27 15:22
 * @desc Elasticsearch实现各种搜索功能
 **/

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "student_index",type="student")
public class Student  implements Serializable {
    @Id
    @Field(type= FieldType.Auto)
    private String studentId;
    @Field(type=FieldType.Auto)
    private String name;

    @Field(type=FieldType.Auto)
    private Integer age;

    @Field(type=FieldType.Auto)
    private List<Double> scores;

}
