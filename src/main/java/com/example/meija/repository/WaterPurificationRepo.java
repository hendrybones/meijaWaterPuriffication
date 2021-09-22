package com.example.meija.repository;

import com.example.meija.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WaterPurificationRepo extends JpaRepository<Products,Long> {
    void deleteProductById(Long id);

    Optional<Products> findProductById();
}
