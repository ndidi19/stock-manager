package com.ndiaye.stockmanager.service;

import com.ndiaye.stockmanager.entity.Article;

import java.util.List;

public interface IArticleService {

    public List<Article> getAllArticles();

    public Article createArticle(Article article);
}
