package com.example.demo.service;

import com.example.demo.model.*;

public class ShelfBuilder {

    public IShelft build(ShelftType type){
        switch (type){
            case A:
                return new ShelftA();
            case B:
                return new ShelftB();
            case C:
                return new ShelftC();
            default:
                return null;
        }
    }
}
