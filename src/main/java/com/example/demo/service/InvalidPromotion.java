package com.example.demo.service;

public class InvalidPromotion extends  RuntimeException{
    public InvalidPromotion(String message){
        super(message);
    }
}
