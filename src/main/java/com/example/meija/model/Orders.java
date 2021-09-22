package com.example.meija.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Orders implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)//cannot be changed once it is set
    private Long id;
    private String date;
    private double orderNumber;
    private double amount;
   private double quantity;

    public Orders(Long id, String date, double orderNumber, double amount, double quantity) {
        this.id = id;
        this.date = date;
        this.orderNumber = orderNumber;
        this.amount = amount;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(double orderNumber) {
        this.orderNumber = orderNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "orders{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", orderNumber=" + orderNumber +
                ", amount=" + amount +
                ", quantity=" + quantity +
                '}';
    }
}
