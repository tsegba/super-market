package com.example.demo;

import com.example.demo.model.Annas;
import com.example.demo.model.Apple;
import com.example.demo.model.Peach;
import com.example.demo.service.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestStep5 {
/*
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
    public void whenMakePromotion50PercentToAppleThenPriceWillBe12_5Euro() {
        Apple apple = new Apple();
        IPromotion promotion = new Reduction50Percent();

        apple.setPromotion(promotion);

        assertThat(apple.getPrice()).isEqualTo(12.5);
    }

    @Test
    public void whenMakePromotion50PercentAndPromotion2EuroToAppleThenPriceWillBe10_5Euro() {
        Apple apple = new Apple();
        IPromotion promotionOne = new Reduction50Percent();
        IPromotion promotionTwo = new Reduction2Euro();

        apple.setPromotion(promotionOne);
        apple.setPromotion(promotionTwo);

        assertThat(apple.getPrice()).isEqualTo(10.5);
    }

    @Test
    public void whenMakePromotion2EuroAndPromotion50PercentToAppleThenPriceWillBe11_5point1Euro() {
        Apple apple = new Apple();
        IPromotion promotionNormal = new Reduction2Euro();
        IPromotion promotionSuperVoucher = new Reduction50Percent();

        apple.setPromotion(promotionNormal);
        apple.setPromotion(promotionSuperVoucher);

        assertThat(apple.getPrice()).isEqualTo(11.5);
    }

    @Test
    public void whenMake2PromotionSuperVoucherToAppleThePriceWillBe6_25() {
        Apple apple = new Apple();
        IPromotion promotionSuperVoucher = new Reduction50Percent();
        IPromotion promotionSuperVoucher2 = new Reduction50Percent();
        apple.setPromotion(promotionSuperVoucher);
        apple.setPromotion(promotionSuperVoucher2);
        assertThat(apple.getPrice()).isEqualTo(6.25);

    }




    @Test
    public void whenMakePromotion50PercentOnAnnasThenPriceWillBe25Euro() {
        Annas annas = new Annas();

        assertThat(annas.getPrice()).isEqualTo(50);

        IPromotion promotion = new Reduction50Percent();
        annas.setPromotion(promotion);

        assertThat(annas.getPrice()).isEqualTo(25);
    }

    @Test
    public void whenMakePromotion50PercentOnPeachThenPriceWillBe15Euro() {
        Peach peach = new Peach();

        assertThat(peach.getPrice()).isEqualTo(30);

        IPromotion promotion = new Reduction50Percent();
        peach.setPromotion(promotion);

        assertThat(peach.getPrice()).isEqualTo(15);
    }*/
}
