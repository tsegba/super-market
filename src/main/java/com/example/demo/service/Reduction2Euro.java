package com.example.demo.service;

import com.example.demo.service.IPromotion;

public class Reduction2Euro implements IPromotion {


    @Override
    public double getPromotion(double price) {
        return 2 ;
    }
}
