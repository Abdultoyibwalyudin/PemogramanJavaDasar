package Chapter6.Latihan;

import Chapter4.Exercise.Exercises416RandomCharacter;

import java.sql.SQLOutput;
import java.util.Random;

public class Latihan11 {
    public static void main(String[] args) {
        final int NUMBER_OF_CHARS = 175;
        final int CHARS_PER_LINE = 25;

        for (int i = 0; i < NUMBER_OF_CHARS; i++){
            char ch = 0;
            if ((i + 1 ) % CHARS_PER_LINE == 0)
                System.out.println(ch);
            else
                System.out.print(ch);
        }
    }
}
