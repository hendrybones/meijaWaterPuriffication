package com.example.meija.service;

import com.example.meija.exception.UserNotFoundException;
import com.example.meija.model.Invoice;
import com.example.meija.repository.InvoiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class InvoiceService {
    private final InvoiceRepo invoiceRepo;
@Autowired
    public InvoiceService(InvoiceRepo invoiceRepo) {
        this.invoiceRepo = invoiceRepo;
    }
    // performing crude operations
    public Invoice addInvoice(Invoice invoice){
    return  invoiceRepo.save(invoice);
    }
    // updating invoice
    public Invoice updateInvoice(Invoice invoice){
    return invoiceRepo.save(invoice);

    }
    // searching invoice by oder number
    public Invoice findInvoiceByOrderNo(double orderNo){
    return invoiceRepo.findInvoiceByOrderNo(orderNo)
            .orElseThrow(()->new UserNotFoundException("Invoice by orderNo" +orderNo+"was not found"));
    }


}
