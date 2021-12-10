package com.ndiaye.stockmanager.controller.dto;

import java.math.BigDecimal;

public class UpdateArticleForm {

    private Long id;

    private String description;

    private BigDecimal unitPriceWithoutTax;

    private BigDecimal vat;

    private String categoryId;

    public UpdateArticleForm() {
    }

    public UpdateArticleForm(Long id, String description, BigDecimal unitPriceWithoutTax, BigDecimal vat, String categoryId) {
        this.id = id;
        this.description = description;
        this.unitPriceWithoutTax = unitPriceWithoutTax;
        this.vat = vat;
        this.categoryId = categoryId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "UpdateArticleForm{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", unitPriceWithoutTax=" + unitPriceWithoutTax +
                ", vat=" + vat +
                ", categoryId='" + categoryId + '\'' +
                '}';
    }
}
