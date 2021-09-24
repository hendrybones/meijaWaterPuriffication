package com.example.meija.controller;

import com.example.meija.model.Orders;
import com.example.meija.model.Products;
import com.example.meija.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Orders")
public class OrderResources {
    private final OrderService orderService;

    public OrderResources(OrderService orderService) {
        this.orderService = orderService;
    }
    @GetMapping("all")
    public ResponseEntity<List<Orders>> getAllProducts(){
        List<Orders>orders=orderService.findALLOrders();
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Orders>getOrdersById(@PathVariable("id") Long id){
        Orders product=orderService.findOrderById(id);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }
    @PostMapping("add")
    public ResponseEntity<Orders> addOrder(@RequestBody Orders orders){
        Orders newOrder=orderService.addOrder(orders);
        return new ResponseEntity<>(newOrder,HttpStatus.CREATED);
    }
    @PutMapping("update")
    public ResponseEntity<Orders> updateOrders(@RequestBody Orders orders){
        Orders updateProduct=orderService.updatingOrders(orders);
        return new ResponseEntity<>(updateProduct,HttpStatus.OK);
    }
    @DeleteMapping ("delete/{id}")
    public ResponseEntity<?> deleteOrder(@PathVariable("id") Long id){
        orderService.deleteOder(id);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
