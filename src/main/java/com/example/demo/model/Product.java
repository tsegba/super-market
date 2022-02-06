package com.example.demo.model;

import com.example.demo.service.IPromotion;
import com.example.demo.service.InvalidPromotion;

public class Product {
    private int quantity;
    private IPromotion promotion;
    private double price;
    private String message;

    public Product(String message) {
        this.message = message;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
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

    public IPromotion getPromotion() {
        return promotion;
    }

    public void setPromotion(IPromotion promotion) {
        if (promotion == null) return;
        this.promotion = promotion;
        double promotionValue = promotion.getPromotion(this.price);
        if (promotionValue >= this.price) {
            throw new InvalidPromotion("can't apply this promotion that product");
        }
        this.setPrice(this.getPrice() - promotionValue);
    }

}
