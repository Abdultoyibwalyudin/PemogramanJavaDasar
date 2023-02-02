package Chapter6.Exercise;

import java.util.Scanner;

public class Exercise635 {
    /** Main Method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner

        // Prompt the user to enter the side of a pentagon
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        // Display the pentagon's area
        System.out.println("The area of the pentagon is " + area(side));
    }

    /** Method area computes and returns the area of a pentagon */
    public static double area(double side) {
        return (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
    }
}
