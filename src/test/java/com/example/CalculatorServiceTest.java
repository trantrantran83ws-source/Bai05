package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    private final CalculatorService calculator = new CalculatorService();

    @Test
    void testAdd() {
        assertEquals(15, calculator.add(10, 5));
    }

    @Test
    void testSubtract() {
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    void testMultiply() {
        assertEquals(50, calculator.multiply(10, 5));
    }

    @Test
    void testDivide() {
        assertEquals(2.0, calculator.divide(10, 5), 0.001);
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }
}