package com.ndiaye.stockmanager.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity(name="articles")
public class Article {

    @Id
    @GeneratedValue
    private Long id;

    private String code;

    private String label;

    private String description;

    private BigDecimal unitPriceWithoutTax;

    private BigDecimal vat;

    private BigDecimal unitPriceWithTax;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Article() {
    }

    public Article(String description, BigDecimal unitPriceWithoutTax, BigDecimal vat) {
        this.description = description;
        this.unitPriceWithoutTax = unitPriceWithoutTax;
        this.vat = vat;
    }

    public Article(String code, String label, String description, BigDecimal unitPriceWithoutTax, BigDecimal vat) {
        this.code = code;
        this.label = label;
        this.description = description;
        this.unitPriceWithoutTax = unitPriceWithoutTax;
        this.vat = vat;
    }

    public Article(String code, String label, String description, BigDecimal unitPriceWithoutTax, BigDecimal vat, BigDecimal unitPriceWithTax, Category category) {
        this.code = code;
        this.label = label;
        this.description = description;
        this.unitPriceWithoutTax = unitPriceWithoutTax;
        this.vat = vat;
        this.unitPriceWithTax = unitPriceWithTax;
        this.category = category;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getUnitPriceWithoutTax() {
        return unitPriceWithoutTax;
    }

    public void setUnitPriceWithoutTax(BigDecimal unitPriceWithoutTax) {
        this.unitPriceWithoutTax = unitPriceWithoutTax;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    public BigDecimal getUnitPriceWithTax() {
        return unitPriceWithTax;
    }

    public void setUnitPriceWithTax(BigDecimal unitPriceWithTax) {
        this.unitPriceWithTax = unitPriceWithTax;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", label='" + label + '\'' +
                ", description='" + description + '\'' +
                ", unitPriceWithoutTax=" + unitPriceWithoutTax +
                ", vat=" + vat +
                ", unitPriceWithTax=" + unitPriceWithTax +
                ", category=" + category +
                '}';
    }
}
