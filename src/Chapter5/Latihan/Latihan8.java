package Chapter5.Latihan;

public class Latihan8 {
    public static void main(String[] args) {
        float sum = 0;
        for (float i = 0.01f; i <= 1.0f; i = i + 0.01f)
            sum += i;

        System.out.println("The sum is " + sum);
    }
}

