package com.ndiaye.stockmanager.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name="customer_orders")
public class CustomerOrder {

    @Id
    @GeneratedValue
    private Long id;

    private String code;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "customerOrder")
    private List<CustomerOrderLine> customerOrderLines;

    public CustomerOrder() {
    }

    public CustomerOrder(String code, Date date, Customer customer, List<CustomerOrderLine> customerOrderLines) {
        this.code = code;
        this.date = date;
        this.customer = customer;
        this.customerOrderLines = customerOrderLines;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<CustomerOrderLine> getCustomerOrderLines() {
        return customerOrderLines;
    }

    public void setCustomerOrderLines(List<CustomerOrderLine> customerOrderLines) {
        this.customerOrderLines = customerOrderLines;
    }

    @Override
    public String toString() {
        return "CustomerOrder{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", date=" + date +
                ", customer=" + customer +
                ", customerOrderLines=" + customerOrderLines +
                '}';
    }
}
