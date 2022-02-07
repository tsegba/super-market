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

    private final ByteArrayOutputStream systemOut = new ByteArrayOutputStream();

    @BeforeEach
    private void setUp() {
        System.setOut(new PrintStream(systemOut));
    }

    @Test
    public void whenMakePay10AppleWithoutPromotionThenTheQuantityWillBe40() {
        Apple apple = new Apple();

        apple.pay(10,null);

        assertThat(apple.getQuantity()).isEqualTo(40);
    }

    @Test
    public void whenMakePay60AppleWithoutPromotionThenThrowException() {
        Apple apple = new Apple();

        assertThrows(IllegalArgumentException.class, () -> { apple.pay(60,null); });
    }

    @Test
    public void whenMakePay10AppleWithoutPromotionThenThePriceIs25() {
        Apple apple = new Apple();

        apple.pay(10,null);

        assertThat(apple.getPrice()).isEqualTo(25);
    }

    @Test
    public void whenMakePay10AppleWithNormalVoucherThenThePriceIs23() {
        Apple apple = new Apple();
        IPromotion normalVoucher = new Reduction2Euro();

        apple.pay(10,normalVoucher);

        assertThat(apple.getPrice()).isEqualTo(23);
    }


    @Test
    public void whenMakePay50AppleWithSuperVoucherThenThePriceIs12_5() {
        Apple apple = new Apple();
        IPromotion superVoucher = new Reduction50Percent();

        apple.pay(50,superVoucher);

        assertThat(systemOut.toString()).isEqualTo("No more Apples");
        assertThat(apple.getPrice()).isEqualTo(12.5);
    }

    @Test
    public void whenMakePay5AppleWithSuperVoucherThenThePriceIs12_5andTheQuantityWillBe45() {
        Apple apple = new Apple();
        IPromotion superVoucher = new Reduction50Percent();

        apple.pay(5,superVoucher);

        assertThat(apple.getQuantity()).isEqualTo(45);
        assertThat(apple.getPrice()).isEqualTo(12.5);
    }

    @Test
    public void whenMakePay5AppleWithNormalVoucherThenThePriceIs23andTheQuantityWillBe45() {
        Apple apple = new Apple();
        IPromotion superVoucher = new Reduction2Euro();
        apple.pay(5,superVoucher);
        assertThat(apple.getQuantity()).isEqualTo(45);
        assertThat(apple.getPrice()).isEqualTo(23);
    }


    /*
    Annas test
     */
    @Test
    public void whenMakePay10AnnasWithNormalVoucherThenThePriceWillBe48() {
        Annas annas = new Annas();
        IPromotion normalVoucher = new Reduction2Euro();

        annas.pay(10,normalVoucher);

        assertThat(annas.getPrice()).isEqualTo(48);
    }

    @Test
    public void whenMakePay80AppleWithoutPromotionThenThrowException() {
        Apple apple = new Apple();

        assertThrows(IllegalArgumentException.class, () -> { apple.pay(80,null); });
    }

    @Test
    public void whenMakePay75AnnasWithSuperVoucherThenThePriceIs25() {
        Annas annas = new Annas();
        IPromotion superVoucher = new Reduction50Percent();

        annas.pay(75,superVoucher);

        assertThat(systemOut.toString()).isEqualTo("No more annas");
        assertThat(annas.getPrice()).isEqualTo(25);
    }

    @Test
    public void whenMakePay5AnnasWithSuperVoucherThenThePriceIs25andTheQuantityWillBe70() {
        Annas annas = new Annas();
        IPromotion superVoucher = new Reduction50Percent();

        annas.pay(5,superVoucher);

        assertThat(annas.getQuantity()).isEqualTo(70);
        assertThat(annas.getPrice()).isEqualTo(25);
    }

    @Test
    public void whenMakePay5AnnasWithNormalVoucherThenThePriceIs48andTheQuantityWillBe70() {
        Annas annas = new Annas();
        IPromotion superVoucher = new Reduction2Euro();
        annas.pay(5,superVoucher);
        assertThat(annas.getQuantity()).isEqualTo(70);
        assertThat(annas.getPrice()).isEqualTo(48);
    }

}
