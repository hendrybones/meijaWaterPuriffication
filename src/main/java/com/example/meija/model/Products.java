package com.example.meija.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Products  implements Serializable {
    @Id// make the id unique
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)//cannot be changed once it is set
    private Long id;
    private String name;
   private double quantityInLiters;
   private String imageUrl;

    public Products(Long id, String name, double quantityInLiters, String imageUrl) {
        this.id = id;
        this.name = name;
        this.quantityInLiters = quantityInLiters;
        this.imageUrl = imageUrl;
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

    public double getQuantityInLiters() {
        return quantityInLiters;
    }

    public void setQuantityInLiters(double quantityInLiters) {
        this.quantityInLiters = quantityInLiters;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantityInLiters=" + quantityInLiters +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
