package pl.javastart.euler2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Euler2Test {
    private EvenFibonacciNumbersCalculator evenFibonacciNumbersCalculator;

    @BeforeEach
    public void init() {
        evenFibonacciNumbersCalculator = new EvenFibonacciNumbersCalculator();
    }

    @Test
    public void shouldReturn0ForLimit1() {
        // when
        long evenFibonacciNumberSum = evenFibonacciNumbersCalculator.countEvenFibonacciNumberSum(1);

        // then
        assertEquals(0, evenFibonacciNumberSum);
    }

    @Test
    public void shouldReturn10ForLimit10() {
        // when
        long evenFibonacciNumberSum = evenFibonacciNumbersCalculator.countEvenFibonacciNumberSum(10);

        // then
        assertEquals(10, evenFibonacciNumberSum);
    }

    @Test
    public void shouldReturn44ForLimit34() {
        // when
        long evenFibonacciNumberSum = evenFibonacciNumbersCalculator.countEvenFibonacciNumberSum(34);

        // then
        assertEquals(44, evenFibonacciNumberSum);
    }
}