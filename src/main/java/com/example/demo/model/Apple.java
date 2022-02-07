package com.example.demo.model;

public class Apple extends Product {
    private double price;
    private int quantity;

    public Apple() {
        super(25,50);
        this.setMessage("No more Apples");
    }
}
