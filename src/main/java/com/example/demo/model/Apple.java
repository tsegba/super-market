package com.example.demo.model;

import com.example.demo.service.IPromotion;
import com.example.demo.service.InvalidPromotion;

public class Apple  {
    private double price;
    private int quantity;

    public Apple() {
        this.price = 25;
        this.quantity = 50;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity==0){
            System.out.print("No more Apples");
        }
        this.quantity = quantity;
    }
}
