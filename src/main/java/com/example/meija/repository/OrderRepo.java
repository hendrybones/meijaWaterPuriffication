package com.example.meija.repository;

import com.example.meija.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderRepo extends JpaRepository<Orders, Long> {
    void deleteOrderById(Long id);

    Optional<Orders> findOrderById(Long id);
}
