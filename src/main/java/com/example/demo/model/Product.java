package com.example.demo.model;

import com.example.demo.service.IPromotion;

public class Product {
    private  int quantity;
    private IPromotion promotion ;
    private double price;
    private String message;

    public Product(String message) {
        this.message = message;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity==0){
            System.out.print(this.message);
        }
        this.quantity = quantity;
    }

    public double getPrice() {
        if(this.promotion == null) return this.price;
        return this.price - this.promotion.getPromotion(this.price) ;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public IPromotion getPromotion() {
        return promotion;
    }

    public void setPromotion(IPromotion promotion) {
        this.promotion = promotion;
    }

}
