package com.ndiaye.stockmanager.controller.dto;

import java.math.BigDecimal;

public class ArticleForm {

    private String description;

    private BigDecimal unitPriceWithoutTax;

    private BigDecimal vat;

    private String categoryId;

    public ArticleForm() {
    }

    public ArticleForm(String description, BigDecimal unitPriceWithoutTax, BigDecimal vat, String categoryId) {
        this.description = description;
        this.unitPriceWithoutTax = unitPriceWithoutTax;
        this.vat = vat;
        this.categoryId = categoryId;
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
        return "ArticleForm{" +
                "description='" + description + '\'' +
                ", unitPriceWithoutTax=" + unitPriceWithoutTax +
                ", vat=" + vat +
                ", categoryId='" + categoryId + '\'' +
                '}';
    }
}
