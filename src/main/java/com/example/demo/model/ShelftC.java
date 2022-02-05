package com.example.demo.model;

import java.util.Objects;

public class ShelftC implements IShelft{
    private ShelftType type;

    public ShelftC() {
        this.type = ShelftType.C;
    }

    @Override
    public ShelftType getType() {
        return type;
    }

    public void setType(ShelftType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShelftC shelftC = (ShelftC) o;
        return type == shelftC.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }
}
