package com.example.demo;

import com.example.demo.model.Peach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestStep3 {
    private final ByteArrayOutputStream systemOut = new ByteArrayOutputStream();
    Peach peach;

    @BeforeEach
    private void setUp() {
        System.setOut(new PrintStream(systemOut));
    }

    @Test
    @DisplayName("Display message when quantity is set to zero")
    public void displayMessageWhenQuatityIsSetToZero() {
        peach = new Peach();
        peach.setQuantity(0);
        assertThat(systemOut.toString()).isEqualTo("No more peaches");
    }
}
