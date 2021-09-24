package com.example.meija.service;

import com.example.meija.exception.UserNotFoundException;
import com.example.meija.model.Products;
import com.example.meija.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductService {
    private final ProductRepo productsRepo;
    @Autowired
    public ProductService(ProductRepo productsRepo) {
        this.productsRepo = productsRepo;
    }

    /* performing crud operations */
    public Products addProducts(Products products){
        products.setProductCode(UUID.randomUUID().toString());
        return  productsRepo.save(products);
    }

    /* finding all products in the inventory */
    public List<Products> findAllProducts(){

        return productsRepo.findAll();
    }

    /* updating the products in the inventory */
    public Products updateProduct(Products products){
        return productsRepo.save(products);
    }

    /* find product by id */
    public Products findProductById(Long id){
        return productsRepo.findProductById()
                .orElseThrow(()->new UserNotFoundException("User by id" +id+"was not found"));
    }

    // delete a product in the database
    public void deleteProduct(Long id){
        productsRepo.deleteProductById(id);
    }

}
