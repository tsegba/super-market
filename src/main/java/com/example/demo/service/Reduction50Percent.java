package com.example.demo.service;

public class Reduction50Percent implements IPromotion {

    @Override
    public double getPromotion(double price) {
        return (price * 50) / 100;
    }
}
