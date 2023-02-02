package Chapter6.Exercise;

import Chapter6.Latihan.Latihan7;

public class Exercise629 {
    private static Latihan7 PrimeNumberMethod;

    /** Main Method */
    public static void main(String[] args) {
        System.out.println();
        for (int p = 2; p < 1000; p++) {
            if (isTwinprime(p))
                System.out.println("(" + p + ", " + (p + 2) + ")");
        }
    }

    /** Method isTwinprime returns true if num and num + 2 are primes */
    public static boolean isTwinprime(int num) {
        return PrimeNumberMethod.isPrime(num) && PrimeNumberMethod.isPrime(num + 2);
    }
}
