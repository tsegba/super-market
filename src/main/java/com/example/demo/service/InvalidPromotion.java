package com.example.demo.service;

public class InvalidPromotion extends  IllegalArgumentException{
    public InvalidPromotion(String message){
        super(message);
    }
}
