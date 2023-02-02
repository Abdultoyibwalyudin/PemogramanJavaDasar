package Chapter6.Exercise;

import java.util.Scanner;

public class Exercise625 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter milliseconds: ");
        long millis = input.nextLong();

        System.out.println("hours:minuties:seconds: " + convertMillis(millis));
    }

    public static String convertMillis(long millis) {
        millis /= 1000;

        String currentMinuteAndSecond = "";
        for (int i = 0; i < 2; i++) {
            currentMinuteAndSecond = ":" + millis % 60 + currentMinuteAndSecond;
            millis /= 60;
        }
        return millis + currentMinuteAndSecond;
    }
}
