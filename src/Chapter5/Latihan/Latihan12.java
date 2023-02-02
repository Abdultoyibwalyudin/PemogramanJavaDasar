package Chapter5.Latihan;

public class Latihan12 {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        while (number < 20) {
            number++;
            sum += number;
            if (sum >= 100)
                break;
        }

        System.out.println("the number is " + number);
        System.out.println("the sum is " + sum);
    }
}
