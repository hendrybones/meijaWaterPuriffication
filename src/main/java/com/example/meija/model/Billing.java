package com.example.meija.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
@Entity // this will make sure that this class is mapped to a database
public class Billing  implements Serializable {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)//cannot be changed once it is set
    private Long id;
    private String customerName;
    private double amount;
    private String Date;
    private double orderNo;

    public Billing(Long id, String customerName, double amount, String date, double orderNo) {
        this.id = id;
        this.customerName = customerName;
        this.amount = amount;
        Date = date;
        this.orderNo = orderNo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public double getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(double orderNo) {
        this.orderNo = orderNo;
    }
}
