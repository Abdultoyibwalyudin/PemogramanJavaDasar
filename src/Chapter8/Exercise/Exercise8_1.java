package Chapter8.Exercise;

import java.util.Scanner;

public class Exercise8_1 {
    public static void main(String[] args) {
        // Read a 3-by-4 matrix
        double [][] matrix = getMatrix();

        // Display the sim of each colum
        for (int col = 0; col < matrix[0].length; col++){
            System.out.println("Sum of the elements at colum " + col + " is " +
                    sumColumn(matrix, col));
        }
    }
    public static double[][] getMatrix(){
        Scanner input = new Scanner(System.in);
        final int ROWS = 3;
        final int COLUMNS = 4;
        double[][] m = new double[ROWS][COLUMNS];

        // Prompt the use to enter a 3-by-4 matrix
        System.out.println("Enter a " + ROWS + "-by-" + COLUMNS +
                "matrix row by row: ");
        for (int row = 0; row < m.length; row++)
            for (int col = 0; col < m[row].length; col++)
                m[row][col] = input.nextDouble();
        return m;
    }
    public static double sumColumn(double[][] m, int columnIndex){
        double sum = 0;
        for (int row = 0; row < m.length; row++){
            sum += m[row][columnIndex];
        }
        return sum;
    }
}
