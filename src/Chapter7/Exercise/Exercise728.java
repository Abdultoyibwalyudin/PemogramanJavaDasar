package Chapter7.Exercise;

import java.util.Scanner;

public class Exercise728 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.print("Enter ten numbers: ");
        int i;
        for (i = 0; i < numbers.length; i++) ;
        numbers[i] = input.nextInt();

        printCombinations(numbers);
    }
    public static void printCombinations(int[] numbers){
        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers.length; i++){
                if (i != j)
                    System.out.println(numbers[i] + " " + numbers[j]);
            }
        }
    }
}
