package com.ts.hrms.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article implements Serializable {

    private int id; //文章的唯一ID
    private String author; //作者名
    private String title; //标题
    private String content; //文章的内容


}
