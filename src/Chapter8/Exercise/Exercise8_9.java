package Chapter8.Exercise;

import java.util.Scanner;

public class Exercise8_9 {
    public static void main(String[] args) {
        // Create a empty board
        String [][] board = getBoard();

        // Create two players token
        String[] tokens = {" X "," O "};

        int result; // game status result

        // Repeat while result is continue
        do {
            // Display board
            print(board);

            // Get available cell to mark
            int[] cell = getCell(board, tokens[0]);

            // Mark available cell with player's token
            placeToken(board, cell, tokens[0]);

            // Determine game status
            result = gameStatus(board, tokens[0]);

            // If status is continue make next player take turn
            if (result == 2) {
                swap(tokens);
            }

        } while(result == 2);

        // Display board
        print(board);

        // Display game results
        if (result == 0)
            System.out.println(tokens[0] + "player won");
        else
            System.out.println("Players draw");

    }
    public static int gameStatus(String[][] m, String e) {
        if (isWin(m, e))
            return 0; // Win
        else if (isDraw(m))
            return 1; // Draw
        else
            return 2; // Continue
    }
    public static boolean isWin(String[][] m, String t) {
        return isHorizontalWin(m, t) || isVerticalWin(m, t) || isDiagonalWin(m, t);
    }
    public static boolean isHorizontalWin(String[][] m, String t) {
        for (int i = 0; i < m.length; i++) {
            int count = 0;
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == t)
                    count++;
            }
            if (count == 3)
                return true;
        }
        return false;
    }
    public static boolean isVerticalWin(String[][] m, String t) {
        for (int i = 0; i < m.length; i++) {
            int count = 0;
            for (int j = 0; j < m[i].length; j++) {
                if (m[j][i] == t)
                    count++;
            }
            if (count == 3)
                return true;
        }
        return false;
    }
    public static boolean isDiagonalWin(String[][] m, String t) {
        int count = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i][i] == t)
                count++;
            if (count == 3)
                return true;
        }

        count = 0;
        for (int i = 0, j = m[i].length - 1; j >= 0 ; j--, i++) {
            if (m[i][j] == t)
                count++;
            if (count == 3)
                return true;
        }
        return false;
    }
    public static boolean isDraw(String[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == "   ")
                    return false;
            }
        }
        return true;
    }
    public static void swap(String[] p) {
        String temp = p[0];
        p[0] = p[1];
        p[1] = temp;
    }
    public static void placeToken(String[][] m, int[] e, String t) {
        m[e[0]][e[1]] = t;
    }
    public static int[] getCell(String[][] m, String t) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        int[] cell = new int[2]; // Cell row and column

        // Prompt player to enter a token
        do {
            System.out.print("Enter a row(0, 1, or 2) for player " + t + ": ");
            cell[0] = input.nextInt();
            System.out.print("Enter a column(0, 1, or 2) for player " + t + ": ");
            cell[1] = input.nextInt();

        } while (!isValidCell(m, cell));
        return cell;
    }
    public static boolean isValidCell(String[][] m, int[] cell) {
        for (int i = 0; i < cell.length; i++) {
            if (cell[i] < 0 || cell[i] >= 3) {
                System.out.println("Invalid cell");
                return false;
            }
        }
        if (m[cell[0]][cell[1]] != "   ") {
            System.out.println(
                    "\nRow " + cell[0] + " column " + cell[1] + " is filled");
            return false;
        }
        return true;
    }
    public static String[][] getBoard() {
        String[][] m = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = "   ";
            }
        }
        return m;
    }
    public static void print(String[][] m) {
        System.out.println("\n-------------");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("|" + m[i][j]);
            }
            System.out.println("|\n-------------");
        }
    }
}

