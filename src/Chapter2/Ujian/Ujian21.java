package Chapter2.Ujian;

import java.util.Scanner;

public class Ujian21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Alas segitiga ");
        double as = input.nextDouble();

        System.out.print("Tinggi segitiga");
        double ts = input.nextDouble();

        System.out.print("Tinggi prisma");
        double tp = input.nextDouble();

        double a = (as/2);
        double b = Math.pow (a ,2);
        double c = Math.pow (ts ,2);
        double d = ( b + c );
        double e =  Math.pow (d,0.5);
        double ks = 2 * e + as;

        double v = (as * ts * 1/2 ) * tp;

        double ip = ( 2 * 1/2 * as * ts ) + (ks * tp);

        System.out.println("hasil dari Keliling adalah " + ks);
        System.out.println("hasil dari volume adalah " + v );
        System.out.println("hasil dari luas adalah " + ip );
    }
}
