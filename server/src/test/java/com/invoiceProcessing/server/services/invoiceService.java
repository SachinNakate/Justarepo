package com.invoiceProcessing.server.services;

import com.invoiceProcessing.server.model.Invoice;

public interface invoiceService {
    public Invoice addInvoice(Invoice invoice); // This is for add information to database
    //from here invoice will be transferred to the invoiceServiceimpl
}
