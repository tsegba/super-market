package com.example.demo.model;

import com.example.demo.service.IPromotion;

public class Apple extends Product {
    private double price;
    private int quantity;

    public Apple() {
        super(25,50);
        this.setMessage("No more Apples");
    }

   public void pay(int quantity, IPromotion voucher){
       this.setQuantity(this.getQuantity() - quantity);
        if(voucher != null){
            this.setPrice(this.getPrice() - voucher.getPromotion(this.getPrice()));
        }
   }
}
