package Chapter4.Exercise;

import java.util.Scanner;

public class Exercises420ProcessAString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a sting: ");
        String str = input.nextLine();

        // Display the string's length and its first character
        System.out.println(str + " has a length of " + str.length() +
                " and its first character is " + str.charAt(0));
    }
}
