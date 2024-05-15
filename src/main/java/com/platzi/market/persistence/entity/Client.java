package com.platzi.market.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "clients")
public class Client {

    @Id
    @Column(name = "client_id")
    private String clientId;

    private String name;

    @Column(name = "last_name")
    private String lastName;

    private Long mobile;

    private String address;

    private String email;

    @OneToMany(mappedBy = "client")
    private List<Purchase> purchases;

    public Client() {
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
