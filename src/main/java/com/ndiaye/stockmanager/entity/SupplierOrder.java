package com.ndiaye.stockmanager.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "supplier_orders")
public class SupplierOrder {

    @Id
    @GeneratedValue
    private Long id;

    private String code;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

    @OneToMany(mappedBy = "supplierOrder")
    private List<SupplierOrderLine> supplierOrderLines;

    public SupplierOrder() {
    }

    public SupplierOrder(String code, Date date, Supplier supplier, List<SupplierOrderLine> supplierOrderLines) {
        this.code = code;
        this.date = date;
        this.supplier = supplier;
        this.supplierOrderLines = supplierOrderLines;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public List<SupplierOrderLine> getSupplierOrderLines() {
        return supplierOrderLines;
    }

    public void setSupplierOrderLines(List<SupplierOrderLine> supplierOrderLines) {
        this.supplierOrderLines = supplierOrderLines;
    }

    @Override
    public String toString() {
        return "SupplierOrder{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", date=" + date +
                ", supplier=" + supplier +
                ", supplierOrderLines=" + supplierOrderLines +
                '}';
    }
}
