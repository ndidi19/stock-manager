package com.ndiaye.stockmanager.repository;

import com.ndiaye.stockmanager.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IArticleRepository extends JpaRepository<Article, Long> {
}
