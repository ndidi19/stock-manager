package com.ndiaye.stockmanager.service.impl;

import com.ndiaye.stockmanager.controller.dto.ArticleForm;
import com.ndiaye.stockmanager.controller.dto.UpdateArticleForm;
import com.ndiaye.stockmanager.entity.Article;
import com.ndiaye.stockmanager.entity.Category;
import com.ndiaye.stockmanager.repository.IArticleRepository;
import com.ndiaye.stockmanager.repository.ICategoryRepository;
import com.ndiaye.stockmanager.service.IArticleService;
import com.ndiaye.stockmanager.service.ICategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.List;

@Service
public class ArticleServiceImpl implements IArticleService {

    private static final String ART_CODE_PREFIX = "ART_";
    private static final int CODE_LENGTH = 8;

    private static final SecureRandom random = new SecureRandom();

    private static final Logger log = LoggerFactory.getLogger(ArticleServiceImpl.class);

    private IArticleRepository articleRepository;
    private ICategoryService categoryService;

    public ArticleServiceImpl(IArticleRepository articleRepository, ICategoryService categoryService) {
        this.articleRepository = articleRepository;
        this.categoryService = categoryService;
    }

    @Override
    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    @Override
    public Article createArticle(ArticleForm articleForm) {
        log.debug("articleForm : " + articleForm);
        Article article = new Article(articleForm.getDescription(), articleForm.getUnitPriceWithoutTax(), articleForm.getVat());
        Category category = categoryService.getCategoryById(articleForm.getCategoryId());
        article.setCategory(category);
        //Generates a random value in hexadecimal format for 'code'
        byte[] token = new byte[CODE_LENGTH];
        random.nextBytes(token);
        //Concat code prefix "ART_" with generated random value
        article.setCode(ART_CODE_PREFIX + new BigInteger(1, token).toString(16).toUpperCase());
        BigDecimal unitPriceWithTax = calculatePriceWithTax(article);
        article.setUnitPriceWithTax(unitPriceWithTax);
        articleRepository.save(article);
        return article;
    }

    @Override
    public void deleteArticleById(Long id) {
        articleRepository.deleteById(id);
    }

    @Override
    public Article getArticleById(Long id) {
        return articleRepository.getById(id);
    }

    @Override
    public Article updateArticle(UpdateArticleForm updateArticleForm) {
        log.debug(updateArticleForm.toString());
        Article article = articleRepository.getById(updateArticleForm.getId());
        article.setDescription(updateArticleForm.getDescription());
        article.setUnitPriceWithTax(updateArticleForm.getUnitPriceWithoutTax());
        article.setVat(updateArticleForm.getVat());
        Category category = categoryService.getCategoryById(updateArticleForm.getCategoryId());
        article.setCategory(category);
        BigDecimal unitPriceWithTax = calculatePriceWithTax(article);
        article.setUnitPriceWithTax(unitPriceWithTax);
        return articleRepository.save(article);
    }

    private BigDecimal calculatePriceWithTax(Article article) {
        BigDecimal taxAmount = article.getUnitPriceWithoutTax()
                .multiply(article.getVat())
                .divide(BigDecimal.valueOf(100));
        BigDecimal unitPriceWithTax = article.getUnitPriceWithoutTax().add(taxAmount);
        return unitPriceWithTax;
    }
}
