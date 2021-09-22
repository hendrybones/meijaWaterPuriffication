package com.example.meija.service;

import com.example.meija.model.Orders;
import com.example.meija.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
