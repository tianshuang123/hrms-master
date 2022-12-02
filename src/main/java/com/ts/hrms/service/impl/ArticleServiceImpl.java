package com.ts.hrms.service.impl;

import com.ts.hrms.bean.Appraise;
import com.ts.hrms.bean.Article;
import com.ts.hrms.mapper.ArticleMapper;
import com.ts.hrms.service.IAppraiseService;
import com.ts.hrms.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements IArticleService {
    @Autowired
    ArticleMapper articleMapper;

    @Override
    public List<Article> queryArticles() {
        return articleMapper.queryArticles();
    }

    @Override
    public int addArticle(Article article) {
        return articleMapper.addArticle(article);
    }

    @Override
    public Article getArticleById(int id) {
        return articleMapper.getArticleById(id);
    }

    @Override
    public int deleteArticleById(int id) {
        return articleMapper.deleteArticleById(id);
    }
}
