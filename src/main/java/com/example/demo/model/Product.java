package com.example.demo.model;

import com.example.demo.service.IPromotion;
import com.example.demo.service.InvalidPromotion;
import com.sun.tools.corba.se.idl.InvalidArgument;

public class Product {
    private int quantity;
    private double price;
    private String message;



    public Product( double price,int initialStock) {
        this.quantity = initialStock;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity must be less than the stock");
        }
        if (quantity == 0) {
            System.out.print(this.message);
        }
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void pay(int quantity, IPromotion voucher){
        this.setQuantity(this.getQuantity() - quantity);
        if(voucher != null){
            this.setPrice(this.getPrice() - voucher.getPromotion(this.getPrice()));
        }
    }
}
