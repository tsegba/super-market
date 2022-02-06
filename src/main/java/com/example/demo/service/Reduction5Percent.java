package com.example.demo.service;

public class Reduction5Percent implements IPromotion {

    @Override
    public double getPromotion(double price) {
        return (price * 5) / 100;
    }
}
