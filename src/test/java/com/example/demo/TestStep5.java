package com.example.demo;

import com.example.demo.model.Annas;
import com.example.demo.model.Apple;
import com.example.demo.service.IPromotion;
import com.example.demo.service.InvalidPromotion;
import com.example.demo.service.Reduction2Euro;
import com.example.demo.service.Reduction5Percent;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestStep5 {

    private final ByteArrayOutputStream systemOut = new ByteArrayOutputStream();

    @BeforeEach
    private void setUp() {
        System.setOut(new PrintStream(systemOut));
    }

    @Test
    public void whenMakePromotion2EuroToAppleWithThenPriceWillBe23Euro() {
        Apple apple = new Apple();
        IPromotion promotion = new Reduction2Euro();

        apple.setPromotion(promotion);

        assertThat(apple.getPrice()).isEqualTo(23);
    }

    @Test
    public void whenMakePromotion5PercentToAppleThenPriceWillBe23_75Euro() {
        Apple apple = new Apple();
        IPromotion promotion = new Reduction5Percent();

        apple.setPromotion(promotion);

        assertThat(apple.getPrice()).isEqualTo(23.75);
    }

    @Test
    public void whenMakePromotion5PercentAndPromotion2EuroToAppleThenPriceWillBe21_75Euro() {
        Apple apple = new Apple();
        IPromotion promotionOne = new Reduction5Percent();
        IPromotion promotionTwo = new Reduction2Euro();

        apple.setPromotion(promotionOne);
        apple.setPromotion(promotionTwo);

        assertThat(apple.getPrice()).isEqualTo(21.75);
    }

    @Test
    public void whenMakePromotion2EuroAndPromotion5PercentToAppleThenPriceWillBe21_85point1Euro() {
        Apple apple = new Apple();
        IPromotion promotionOne = new Reduction5Percent();
        IPromotion promotionTwo = new Reduction2Euro();

        apple.setPromotion(promotionTwo);
        apple.setPromotion(promotionOne);

        assertThat(apple.getPrice()).isEqualTo(21.85);
    }

    @Test
    public void whenMakePromotion2EuroOnAppleWithPrice2EuroThenThrowInvalidPromotion() {
        Apple apple = new Apple(2);
        IPromotion promotion = new Reduction2Euro();

        assertThrows(InvalidPromotion.class, () -> {
            apple.setPromotion(promotion);
        });
    }

    @Test
    public void whenMakePromotion2EuroOnAppleWithPrice1EuroThenThrowInvalidPromotion() {
        Apple apple = new Apple(1);
        IPromotion promotion = new Reduction2Euro();

        assertThrows(InvalidPromotion.class, () -> {
            apple.setPromotion(promotion);
        });
    }

    @Test
    public void whenMakePromotion5PercentOnAnnasWithPrice7EuroThenPriceWillBe6_65Euro() {
        Annas annas = new Annas(7);
        IPromotion promotion = new Reduction5Percent();
        annas.setPromotion(promotion);

        assertThat(annas.getPrice()).isEqualTo(6.65);
    }


}
