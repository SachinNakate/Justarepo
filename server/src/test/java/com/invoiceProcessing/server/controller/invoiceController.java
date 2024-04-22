package com.invoiceProcessing.server.controller;


import com.invoiceProcessing.server.model.Invoice;
import com.invoiceProcessing.server.services.invoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // This for Spring should know this is a controller
@CrossOrigin
public class invoiceController {

    @Autowired // This is because we cannot make object of interface
    invoiceService InvoiceService;
    // The implementation of following is written invoiceservices
    @PostMapping("/invoice") // This is for mapping the Api or to handle api
    // This will handle invoice end point
    public Invoice addInvoice(@RequestBody Invoice invoice){
        return this.InvoiceService.addInvoice(invoice); // from here the invoice will be passed to invoiceService interface


    }
}
