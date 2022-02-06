package com.example.demo.model;

public class Annas extends Product {

    public Annas() {
        super("No more Annas");
        this.setPrice(50);
        this.setQuantity(75);
    }

    public Annas(double price) {
        super("No more Annas");
        this.setPrice(price);
        this.setQuantity(75);
    }
}
