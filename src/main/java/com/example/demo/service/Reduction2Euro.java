package com.example.demo.service;

public class Reduction2Euro implements IPromotion {


    @Override
    public double getPromotion(double price) {
        return 2;
    }
}
