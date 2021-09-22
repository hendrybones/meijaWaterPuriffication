package com.example.meija.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
public class Products  implements Serializable {
    @Id// make the id unique
    private Long id;
    private String name;
   private double quantityInLiters;
   private String imageUrl;



}
