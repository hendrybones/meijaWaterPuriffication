package com.example.meija.model;

import javax.persistence.Entity;
import java.io.Serializable;
@Entity // this will make sure that this class is mapped to a database
public class Billing  implements Serializable {
    private String customerName;
    private double amount;
    private String Date;
    private double orderNo;

}
