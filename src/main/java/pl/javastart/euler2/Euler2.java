package pl.javastart.euler2;

public class Euler2 {
    private static final int LIMIT = 4_000_000;

    public static void main(String[] args) {
        var evenFibonacciNumbersCalc = new EvenFibonacciNumbersCalculator();
        long evenFibonacciNumberSum = evenFibonacciNumbersCalc.countEvenFibonacciNumberSum(LIMIT);
        System.out.printf("Suma parzystych elementów ciągu Fibonacciego, " +
                "których wartość jest mniejsza niż %d wynosi %d.", LIMIT, evenFibonacciNumberSum);
    }
}
