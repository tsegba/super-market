package com.example.demo.model;

import com.example.demo.service.IPromotion;
import com.example.demo.service.InvalidPromotion;

public class Apple extends Product {
    private IPromotion promotion;

    public Apple() {
        super("No more Apples");
    }

    public Apple(double price) {
        super("No more Apples");
        setPrice(price);
    }

    public IPromotion getPromotion() {
        return promotion;
    }

    public void setPromotion(IPromotion promotion) {
        if (promotion == null) return;
        this.promotion = promotion;
        double promotionValue = promotion.getPromotion(super.getPrice());
        if (promotionValue >= super.getPrice()) {
            throw new InvalidPromotion("can't apply this promotion that product");
        }
        this.setPrice(this.getPrice() - promotionValue);
    }

}
