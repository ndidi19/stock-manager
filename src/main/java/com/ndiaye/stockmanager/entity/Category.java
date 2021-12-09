package com.ndiaye.stockmanager.entity;

import javax.persistence.*;
import java.util.List;

@Entity(name="categories")
public class Category {

    @Id
    @GeneratedValue
    private Long id;

    private String code;

    private String label;

    @OneToMany(mappedBy = "category", cascade = CascadeType.REMOVE)
    private List<Article> articles;

    public Category() {
    }

    public Category(String code, String label) {
        this.code = code;
        this.label = label;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", label='" + label + '\'' +
                ", articles=" + articles +
                '}';
    }
}
