package com.example.meija.service;

import com.example.meija.exception.UserNotFoundException;
import com.example.meija.model.Orders;
import com.example.meija.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepo orderRepo;
@Autowired
    public OrderService(OrderRepo orderRepo) {

    this.orderRepo = orderRepo;
    }
    //perform crud operation
    public Orders addOrder(Orders orders){
    return orderRepo.save(orders);

    }
    //updating orders
    public Orders updatingOrders(Orders orders){
    return orderRepo.save(orders);
    }

    public void deleteOder(Long id){
    orderRepo.deleteOrderById(id);
    }
    public List<Orders> findALLOrders(){
    return  orderRepo.findAll();
    }
    public Orders findOrderById(Long id){
    return  orderRepo.findOrderById(id)
            .orElseThrow(()->new UserNotFoundException("Oder by id" +id+"was not found"));

    }



}
