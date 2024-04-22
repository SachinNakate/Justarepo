package com.invoiceProcessing.server.model;
// This will handle the things which are coming from frontend as user input ( defaultObj)

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // This will create table with the name invoice with the help of Hibernate
public class Invoice {
    @Id// This will take id as a primary key
    @GeneratedValue(strategy = GenerationType.AUTO) // This will generate id automatically
    private long id; // This will create a unique id in backend for CRUD techniques
    private String vendor;
    private String product;
    private int amount;
    private String date;
    private String action;

    // if you are making paramatrized you have to make a default constructor
    public Invoice() {} // default constructor
    public Invoice(long id, String vendor, String product, int amount, String date, String action) {
        this.id = id;
        this.vendor = vendor;
        this.product = product;
        this.amount = amount;
        this.date = date;
        this.action = action;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
