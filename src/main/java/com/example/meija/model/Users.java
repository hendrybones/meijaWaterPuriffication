package com.example.meija.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Users implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)//cannot be changed once it is set
    private Long id;
    private String name;
   private String email;
    private String contacts;
    private double idNo;

    public Users(Long id, String name, String email, String contacts, double idNo) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.contacts = contacts;
        this.idNo = idNo;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public double getIdNo() {
        return idNo;
    }

    public void setIdNo(double idNo) {
        this.idNo = idNo;
    }
}
