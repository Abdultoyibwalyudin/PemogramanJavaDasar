package Chapter4.Exercise;

public class Exercises416RandomCharacter {
    public static void main(String[] args) {
        // Generate a random number between 65 and 90
        int number = 65 + (int)(Math.random() * (91 - 65));

        // Display a random uppercase letter
        System.out.println((char)(number));
    }
}
