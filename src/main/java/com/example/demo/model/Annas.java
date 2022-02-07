package com.example.demo.model;

public class Annas{

    private double price;
    private int quantity;

    public Annas() {

        this.price = 50;
        this.quantity = 75;
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
            System.out.print("No more annas");
            return;
        }
        this.quantity = quantity;
    }
}
