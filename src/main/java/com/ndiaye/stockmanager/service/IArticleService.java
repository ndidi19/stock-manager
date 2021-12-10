package com.ndiaye.stockmanager.service;

import com.ndiaye.stockmanager.controller.dto.ArticleForm;
import com.ndiaye.stockmanager.controller.dto.UpdateArticleForm;
import com.ndiaye.stockmanager.entity.Article;

import java.util.List;

public interface IArticleService {

    public List<Article> getAllArticles();

    public Article createArticle(ArticleForm article);

    public void deleteArticleById(Long id);

    Article getArticleById(Long id);

    Article updateArticle(UpdateArticleForm updateArticleForm);
}
