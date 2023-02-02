package Chapter5.Exercise;

public class Exercise518A {
    public static void main(String[] args) {
        // Pattern A
        System.out.println("Pattern A");
        for (int rows = 1; rows <= 6; rows++) {
            for (int cols = 1; cols <= rows ; cols++) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }
}
