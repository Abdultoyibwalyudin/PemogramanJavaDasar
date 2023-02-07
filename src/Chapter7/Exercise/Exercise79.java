package Chapter7.Exercise;

import java.util.Scanner;

public class Exercise79 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];

        //Prompt the use to enter ten numbers
        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextDouble();
        }

        //Display the minimum value
        System.out.println("The minimum number is: " + min(numbers));
    }

    /** Method min returns the smallest element in an array of double values */
    public static double min(double[] array){
        double min = array[0]; //The minimum value
        for (double i: array){
            if (i < min)
                min = i;
        }
        return min;
    }
}
