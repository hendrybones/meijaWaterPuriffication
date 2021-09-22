package com.example.meija.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;
@Entity
public class Invoice implements Serializable {
 @Id
    private Date date;
    private String customerName;
    private double quantity;
    private double orderNo;
    private double goodReceipt;
    private double amount;
}
