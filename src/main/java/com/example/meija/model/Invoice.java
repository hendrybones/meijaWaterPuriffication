package com.example.meija.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
public class Invoice implements Serializable {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     @Column(nullable = false,updatable = false)//cannot be changed once it is set
    private Date date;
    private String customerName;
    private double quantity;
    private double orderNo;
    private double goodReceipt;
    private double amount;

    public Invoice(Date date, String customerName, double quantity, double orderNo, double goodReceipt, double amount) {
        this.date = date;
        this.customerName = customerName;
        this.quantity = quantity;
        this.orderNo = orderNo;
        this.goodReceipt = goodReceipt;
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(double orderNo) {
        this.orderNo = orderNo;
    }

    public double getGoodReceipt() {
        return goodReceipt;
    }

    public void setGoodReceipt(double goodReceipt) {
        this.goodReceipt = goodReceipt;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
