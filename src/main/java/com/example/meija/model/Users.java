package com.example.meija.model;

import javax.persistence.Entity;
import java.io.Serializable;
@Entity
public class Users implements Serializable {
    private String name;
   private String email;
    private String contacts;
    private double idNo;

}
