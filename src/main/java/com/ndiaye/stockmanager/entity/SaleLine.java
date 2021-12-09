package com.ndiaye.stockmanager.entity;

import javax.persistence.*;

@Entity(name="sale_lines")
public class SaleLine {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "sale_id")
    private Sale sale;

    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;

    public SaleLine() {
    }

    public SaleLine(Sale sale, Article article) {
        this.sale = sale;
        this.article = article;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public Article getArticle() {
        return article;
    }

    public Long getId() {
        return id;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    @Override
    public String toString() {
        return "SaleLine{" +
                "id=" + id +
                ", sale=" + sale +
                ", article=" + article +
                '}';
    }
}
