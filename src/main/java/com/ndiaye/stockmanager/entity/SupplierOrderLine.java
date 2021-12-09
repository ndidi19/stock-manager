package com.ndiaye.stockmanager.entity;

import javax.persistence.*;

@Entity(name = "supplier_order_lines")
public class SupplierOrderLine {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;

    @ManyToOne
    @JoinColumn(name = "supplier_order_id")
    private SupplierOrder supplierOrder;

    public SupplierOrderLine() {
    }

    public SupplierOrderLine(Article article, SupplierOrder supplierOrder) {
        this.article = article;
        this.supplierOrder = supplierOrder;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public SupplierOrder getSupplierOrder() {
        return supplierOrder;
    }

    public void setSupplierOrder(SupplierOrder supplierOrder) {
        this.supplierOrder = supplierOrder;
    }

    @Override
    public String toString() {
        return "SupplierOrderLine{" +
                "id=" + id +
                ", article=" + article +
                ", supplierOrder=" + supplierOrder +
                '}';
    }
}
