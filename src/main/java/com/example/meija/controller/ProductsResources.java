package com.example.meija.controller;

import com.example.meija.model.Products;
import com.example.meija.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsResources {
    private final ProductService productService;

    public ProductsResources( ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("all")
    public ResponseEntity<List<Products>>getAllProducts(){
        List<Products>product=productService.findAllProducts();
        return new ResponseEntity<>(product, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Products>getProductsById(@PathVariable("id") Long id){
        Products product=productService.findProductById(id);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }
    @PostMapping("add")
    public ResponseEntity<Products> addProduct(@RequestBody Products products){
        Products newProduct=productService.addProducts(products);
        return new ResponseEntity<>(newProduct,HttpStatus.CREATED);
    }
    @PutMapping("update")
    public ResponseEntity<Products> updateProduct(@RequestBody Products products){
        Products updateProduct=productService.updateProduct(products);
        return new ResponseEntity<>(updateProduct,HttpStatus.OK);
    }
    @DeleteMapping ("delete/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable("id") Long id){
        productService.deleteProduct(id);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
