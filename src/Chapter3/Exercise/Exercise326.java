package Chapter3.Exercise;

import java.util.Scanner;

public class Exercise326 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);	// Create Scanner object

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.println("Is 10 divisible by 5 and 6? " +
                ((number % 5 == 0) && (number % 6 == 0)));
        System.out.println("Is 10 divisible by 5 or 6? " +
                ((number % 5 == 0) || (number % 6 == 0)));
        System.out.println("Is 10 divisible by 5 of 6, but not both? " +
                ((number % 5 == 0) ^ (number % 6 == 0)));
    }
}
