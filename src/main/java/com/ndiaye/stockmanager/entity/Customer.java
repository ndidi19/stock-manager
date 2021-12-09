package com.ndiaye.stockmanager.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity(name="customers")
public class Customer {

    @Id
    @GeneratedValue
    private Long id;

    private String firstname;

    private String lastname;

    private String address;

    private String mail;

    private String photo;

    @OneToMany(mappedBy = "customer")
    private List<CustomerOrder> customerOrders;

    public Customer() {
    }

    public Customer(String firstname, String lastname, String address, String mail, String photo) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.mail = mail;
        this.photo = photo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", mail='" + mail + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }
}
