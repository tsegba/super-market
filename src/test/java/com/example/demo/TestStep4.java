package com.example.demo;

import com.example.demo.model.*;
import com.example.demo.service.ShelfBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestStep4 {
    private final ByteArrayOutputStream systemOut = new ByteArrayOutputStream();

    @Test
    @DisplayName("new instance Shelft A type test")
    public void whenCreateShelftAthenTypewillEqualToTypeA() {

        IShelft shelft = new ShelfBuilder().build(ShelftType.A);

        assertThat(shelft).isInstanceOf(ShelftA.class);
        assertThat(shelft.getType()).isEqualTo(ShelftType.A);
    }

    @Test
    @DisplayName("new instance Shelft B type test")
    public void whenCreateShelftBthenTypewillEqualToTypeB() {
        IShelft shelft = new ShelfBuilder().build(ShelftType.B);

        assertThat(shelft).isInstanceOf(ShelftB.class);
        assertThat(shelft.getType()).isEqualTo(ShelftType.B);
    }

    @Test
    @DisplayName("new instance Shelft C type test")
    public void whenCreateShelftCthenTypewillEqualToTypeC() {
        IShelft shelft = new ShelfBuilder().build(ShelftType.C);

        assertThat(shelft).isInstanceOf(ShelftC.class);
        assertThat(shelft.getType()).isEqualTo(ShelftType.C);
    }
}
