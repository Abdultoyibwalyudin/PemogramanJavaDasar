package Chapter4.Exercise;

import java.util.Scanner;

public class Exercises426FinancialApplicationMonetaryUnits {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive the amount
        System.out.print("Enter an amount: ");
        String amount = input.nextLine();

        // Find the number of one dollars
        String numberOfOneDollars = amount.substring(0, amount.indexOf('.'));



        // Display results
        System.out.println("Your amount " + amount + " consists of");
        System.out.println("	" + numberOfOneDollars + " dollars");
    }
}
