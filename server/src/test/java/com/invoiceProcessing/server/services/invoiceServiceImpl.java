package com.invoiceProcessing.server.services;

import com.invoiceProcessing.server.dao.InvoiceDao;
import com.invoiceProcessing.server.model.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class invoiceServiceImpl implements invoiceService {

    @Autowired
    InvoiceDao invoiceDao;

    @Override
    public Invoice addInvoice(Invoice invoice) {
        invoiceDao.save(invoice) // This will the invoice in database
        return invoice;
    }
}
