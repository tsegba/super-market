package com.example.demo;

import com.example.demo.model.Annas;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestStep2 {
    private final ByteArrayOutputStream systemOut = new ByteArrayOutputStream();
    Annas aanas;

    @BeforeEach
    private void setUp() {
        System.setOut(new PrintStream(systemOut));
    }

    @Test
    @DisplayName("Display message when quantity is set to zero")
    public void displayMessageWhenQuatityIsSetToZero() {
        aanas = new Annas();
        aanas.setQuantity(0);
        assertThat(systemOut.toString()).isEqualTo("No more Annas");
    }
}
