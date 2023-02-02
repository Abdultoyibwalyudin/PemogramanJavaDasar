package Chapter6.Exercise;

import Chapter6.Latihan.Latihan7;

public class Exercise610 {
    private static Latihan7 PrimeNumberMethod;

    /** Main Method */
    public static void main(String[] args) {
        int numberOfPrimes = 0;

        for (int i = 1; i < 1000; i++) {
            if (PrimeNumberMethod.isPrime(i))
                numberOfPrimes++;
        }
        
        System.out.println("The number of prime numbers less than 10000: " + numberOfPrimes);
    }
}
