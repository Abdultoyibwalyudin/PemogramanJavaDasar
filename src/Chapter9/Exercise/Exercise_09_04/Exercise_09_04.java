package Chapter9.Exercise.Exercise_09_04;

public class Exercise_09_04 {
    public static void main(String[] args){
        java.util.Random randomNumber = new java.util.Random(1000);

        for (int i = 1; i <= 50; i++){
            if (i % 10 == 0)
                System.out.printf("%5d\n", randomNumber.nextInt(1000));
            else
                System.out.printf("%5d", randomNumber.nextInt(1000));
        }
    }
}
