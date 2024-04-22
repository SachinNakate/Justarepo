package com.invoiceProcessing.server.dao;

import com.invoiceProcessing.server.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

// This interface will save the data in MySql
// Jparepo<Model, primary key>
public interface InvoiceDao extends JpaRepository <Invoice,Long> {
}
