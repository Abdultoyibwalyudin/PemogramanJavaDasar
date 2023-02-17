package Chapter8.Exercise;


import java.util.Scanner;

public class Exercise8_2 {
    public static void main(String[] args) {
        // Create a 4-by-4 matrix
        double[][] matrix = getMatrix();
        // Display the sum the major diagonal
        System.out.println("Sum the elements in the major diagonal is " +
                sumMajorDiagonal(matrix));
    }
    public static double[][] getMatrix(){
        Scanner input = new Scanner(System.in);

        // Create a 4-by-4 matrix
        final int ROWS = 4;
        final int COLUMNS = 4;
        double[][] m = new double[ROWS][COLUMNS];

        // Prompt user to enter a 4-by-4 matrix
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        for (int row = 0; row < ROWS; row++){
            for (int col = 0; col < COLUMNS; col++){
                m[row][col] = input.nextDouble();
            }
        }
        return m;
    }
    public static double sumMajorDiagonal(double[][] m){
        double sum = 0;
        for (int i = 0; i < m.length; i++){
            sum += m[i][i];
        }
        return sum;
    }
}
