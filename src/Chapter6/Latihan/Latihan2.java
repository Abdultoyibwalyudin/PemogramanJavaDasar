package Chapter6.Latihan;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;

public class Latihan2 {
    public static void main(String[] args) {
        System.out.print("The grade is ");
        printGrade(78.5);

        System.out.print("The grade is ");
        printGrade(59.5);
    }
    public static void printGrade(Double score){
        if (score >= 90.0){
            System.out.println('A');
        }
        else if (score >= 80.0){
            System.out.println('B');
        }
        else if (score >= 70.0){
            System.out.println('C');
        }
        else if (score >= 60.0){
            System.out.println('D');
        }
        else {
            System.out.println('f');
        }

    }
}
