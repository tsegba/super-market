package com.example.demo.model;

public class ShelftB implements IShelft {
    private ShelftType type;

    public ShelftB() {
        this.type = ShelftType.B;
    }

    public ShelftType getType() {
        return type;
    }

    public void setType(ShelftType type) {
        this.type = type;
    }
}
