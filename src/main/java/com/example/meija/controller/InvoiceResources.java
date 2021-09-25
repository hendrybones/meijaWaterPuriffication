package com.example.meija.controller;

import com.example.meija.model.Invoice;
import com.example.meija.model.Orders;
import com.example.meija.model.Products;
import com.example.meija.service.InvoiceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class InvoiceResources {
    private final InvoiceService invoiceService;

    public InvoiceResources(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }
/*
    @GetMapping("all")
    public ResponseEntity<List<Invoice>> getAllInvoice(){
        List<Invoice>invoice=invoiceService.findInvoiceByOrderNo();
        return new ResponseEntity<>(invoice, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Invoice>getProductsById(@PathVariable("id") Long id){
        Products product=productService.findProductById(id);
        return new ResponseEntity<>(product, HttpStatus.OK);
*/
//}
    @PostMapping("add")
    public ResponseEntity<Invoice> addInvoice(@RequestBody Invoice invoice){
        Invoice newInvoice=invoiceService.addInvoice(invoice);
        return new ResponseEntity<>(newInvoice,HttpStatus.CREATED);
    }
    @PutMapping("update")
    public ResponseEntity<Invoice> updateProduct(@RequestBody Invoice invoice){
        Invoice updateProduct=invoiceService.updateInvoice(invoice);
        return new ResponseEntity<>(updateProduct,HttpStatus.OK);
    }
/*
    @DeleteMapping ("delete/{id}")
    public ResponseEntity<?> deleteInvoice(@PathVariable("id") Long id){
        invoiceService.(id);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
*/
}
