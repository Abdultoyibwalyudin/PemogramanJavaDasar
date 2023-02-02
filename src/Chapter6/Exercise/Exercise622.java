package Chapter6.Exercise;

import java.util.Scanner;

public class Exercise622 {
    /** Main Method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = input.nextLong();

        System.out.println(
                "The approximated square root of " + number + " is: " + sqrt(number));
    }

    /** Method squrt approximates the square root of n */
    public static double sqrt(long n) {
        long lastGuess = 1;
        long nextGuess = (lastGuess + n / lastGuess) / 2;

        while (nextGuess - lastGuess > 0.0001) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;
        }
        lastGuess = nextGuess;
        return nextGuess = (lastGuess + n / lastGuess) / 2;
    }
}
