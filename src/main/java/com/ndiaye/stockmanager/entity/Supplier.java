package com.ndiaye.stockmanager.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity(name = "suppliers")
public class Supplier {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String address;

    private String mail;

    private String photo;

    @OneToMany(mappedBy = "supplier")
    private List<SupplierOrder> supplierOrders;

    public Supplier() {
    }

    public Supplier(String name, String address, String mail, String photo, List<SupplierOrder> supplierOrders) {
        this.name = name;
        this.address = address;
        this.mail = mail;
        this.photo = photo;
        this.supplierOrders = supplierOrders;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public List<SupplierOrder> getSupplierOrders() {
        return supplierOrders;
    }

    public void setSupplierOrders(List<SupplierOrder> supplierOrders) {
        this.supplierOrders = supplierOrders;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mail='" + mail + '\'' +
                ", photo='" + photo + '\'' +
                ", supplierOrders=" + supplierOrders +
                '}';
    }
}
