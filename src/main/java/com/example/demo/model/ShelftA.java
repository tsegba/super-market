package com.example.demo.model;

public class ShelftA implements IShelft{
    private ShelftType type;

    public ShelftA() {
        type = ShelftType.A;
    }

    public ShelftType getType() {
        return type;
    }

    public void setType(ShelftType type) {
        this.type = type;
    }
}
