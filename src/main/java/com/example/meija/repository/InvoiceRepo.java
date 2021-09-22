package com.example.meija.repository;

import com.example.meija.model.Inventory;
import com.example.meija.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InvoiceRepo extends JpaRepository<Invoice, Long> {

    void deleteInvoiceById(Long id);

    Optional<Invoice> findInvoiceByOrderNo(double orderNo);
}
