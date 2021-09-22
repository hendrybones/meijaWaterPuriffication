package com.example.meija.model;

import javax.persistence.Entity;
import java.io.Serializable;
@Entity
public class orders  implements Serializable {
    private String date;
    private double orderNumber;
    private double amount;
   private double quantity;
}
