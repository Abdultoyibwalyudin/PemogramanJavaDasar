package Chapter4.Exercise;

import java.util.Scanner;

public class Exercises49FindTheUnicodeOfaCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a character
        System.out.print("Enter a character: ");
        String s = input.nextLine();
        char ch = s.charAt(0);

        // Display Unicode of character
        System.out.println((int)ch);
    }
}
