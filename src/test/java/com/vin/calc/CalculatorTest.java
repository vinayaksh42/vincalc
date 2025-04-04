package com.vin.calc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testMultiplyWithDefault() {
        Calculator calc = Calculator.build();
        assertEquals(50, calc.multiply(5));
    }

    @Test
    public void testMultiplyWithCustomValue() {
        Calculator calc = Calculator.build();
        calc.setMultiplyWith(4);
        assertEquals(20, calc.multiply(5));
    }

    @Test
    public void testMultiplyWithZeroThrowsException() {
        Calculator calc = Calculator.build();
        calc.setMultiplyWith(0);
        assertThrows(IllegalArgumentException.class, () -> {
            calc.multiply(5);
        });
    }
}
