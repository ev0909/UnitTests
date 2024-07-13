package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Test
    void plus() {

        final int x = 5;
        final int y = 7;
        final int expected = 12;

        final int result = calc.plus.apply(x, y);

        Assertions.assertEquals(expected, result);
    }


    @Test
    void minus() {

        final int x = 10;
        final int y = 7;
        final int expected = 3;

        final int result = calc.minus.apply(x, y);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void multiply() {

        final int x = 5;
        final int y = 7;
        final int expected = 35;

        final int result = calc.multiply.apply(x, y);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void devide() {

        final int x = 35;
        final int y = 7;
        final int expected = 5;

        final int result = calc.devide.apply(x, y);

        Assertions.assertEquals(expected, result);
    }
}