package Chapter2.Ujian;

import java.util.Scanner;

public class Ujian22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nilai rupiah : ");
        double rupiah = input.nextDouble();

        double dolar =  rupiah / 15665.5 ;

        System.out.print((int) rupiah + " rupiah = ");
        System.out.printf("%.2f", dolar );
        System.out.print(" Dolar ");
    }
}
