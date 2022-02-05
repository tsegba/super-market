package com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SuperMarketApplicationTests {

    //@Test
    // void contextLoads() {
    //}
    @DisplayName("Tester l'éaglite")
    @Test
    public void test() {
        assertThat(0).isEqualTo(0);
    }

    @DisplayName("Gerer les sommes")
    @ParameterizedTest(name = "{0} + {1} should equal to {2}")
    @CsvSource({"1,1,2", "2,3,5", "42,57,99"})
    public void add_shouldReturnTheSum_ofMultipleIntegers(int arg1, int arg2, int expectResult) {
        // Arrange -- Tout est prêt !

        // Act
        int actualResult = arg1 + arg2;

        // Assert
        assertThat(expectResult).isEqualTo(actualResult);
    }



}
