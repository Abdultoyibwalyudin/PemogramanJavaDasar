package Chapter6.Exercise;

public class Exercise627 {
    /**
     * Main Method
     */
    public static void main(String[] args) {
        final int NUMBER_OF_EMIRPS = 100;
        final int EMIRPS_PER_LINE = 10;

        int count = 0;
        int n = 2;

        while (count < NUMBER_OF_EMIRPS) {
            if (isEmirp(n)) {
                count++;
                System.out.print(count % EMIRPS_PER_LINE == 0 ? n + "\n" : n + " ");
            }
            n++;
        }
    }

    private static boolean isEmirp(int n) {
        return false;
    }
}
