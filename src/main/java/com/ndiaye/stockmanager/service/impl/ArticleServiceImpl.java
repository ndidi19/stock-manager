package com.ndiaye.stockmanager.service.impl;

import com.ndiaye.stockmanager.entity.Article;
import com.ndiaye.stockmanager.repository.IArticleRepository;
import com.ndiaye.stockmanager.service.IArticleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ArticleServiceImpl implements IArticleService {

    private static final String ART_CODE_PREFIX = "ART_";

    private static final Logger log = LoggerFactory.getLogger(ArticleServiceImpl.class);

    private IArticleRepository articleRepository;

    public ArticleServiceImpl(IArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    @Override
    public Article createArticle(Article article) {
        log.debug("articleForm : " + article);

        article.setCode(ART_CODE_PREFIX);
        BigDecimal taxAmount = article.getUnitPriceWithoutTax().multiply(article.getVat()).divide(BigDecimal.valueOf(100));
        article.setUnitPriceWithTax(article.getUnitPriceWithoutTax().add(taxAmount));
        articleRepository.save(article);
        return null;
    }
}
