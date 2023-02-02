package Chapter6.Latihan;

import java.sql.SQLOutput;

public class Latihan7 {
    public static void main(String[] args) {
        System.out.println("The first 50 prime numbers are \n");
        printPrimeNumbwers(50);
    }
    public static void printPrimeNumbwers(int numbersofPrimes){
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        int number = 2;

        while (count < numbersofPrimes){
            if (isPrime(number)){
                count++;
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0){
                    System.out.printf("%-5d\n", number);
                }
                else
                    System.out.printf("%-5d", number);
            }
            number++;
        }
    }
    public static boolean isPrime(int number){
        for (int divisor = 2; divisor <= number / 2; divisor++){
            if (number % divisor == 0){
                return false;
            }
        }
        return true;
    }
}
