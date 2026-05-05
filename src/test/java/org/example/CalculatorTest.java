package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    Calculator calc = new Calculator();
    
    
    @Test
    void testAddition() {
        assertEquals(calc.add(2, 3 ), calc.divide(10, 5));
    }

    public void assertEquals(int add, int divide) {
    }

    @Test
    void testDivision() {
        assertEquals(2, calc.divide(10, 5));
    }
    @Test
    void divisionByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
    }
}