package Chapter3.Exercise;

import java.util.Scanner;

public class Exercise315Lottery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lottery = (int)(Math.random() * 1000);

        System.out.print("Enter a three-digit number: ");
        int guess = input.nextInt();

        int lotteryDigit1 = lottery / 100;
        int RemainingDigits = lottery % 100;
        int lotteryDigit2 = RemainingDigits / 10;
        int lotteryDigit3 = RemainingDigits % 10;

        int guessDigit1 = guess / 100;
        RemainingDigits = guess % 100;
        int guessDigit2 = RemainingDigits / 10;
        int guessDigit3 = RemainingDigits % 10;

        System.out.println("The lottery number is " + lottery);

        if (guess == lottery)
            System.out.println("Exact match: you win $10,000");
        if (guessDigit1 == lotteryDigit2)
        {

        }
    }
}
