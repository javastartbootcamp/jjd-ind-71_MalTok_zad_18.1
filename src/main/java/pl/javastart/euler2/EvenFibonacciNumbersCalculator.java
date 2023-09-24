package pl.javastart.euler2;

class EvenFibonacciNumbersCalculator {

    public long countEvenFibonacciNumberSum(int limit) {
        int firstValue = 0;
        int secondValue = 1;
        int tempResult = 0;

        long sum = 0;

        while (tempResult <= limit) {
            tempResult = firstValue + secondValue;
            firstValue = secondValue;
            secondValue = tempResult;
            if (tempResult <= limit && tempResult % 2 == 0) {
                sum += tempResult;
            }
        }
        return sum;
    }
}
