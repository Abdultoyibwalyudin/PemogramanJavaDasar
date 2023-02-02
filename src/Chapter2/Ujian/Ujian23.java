package Chapter2.Ujian;

import java.util.Scanner;

public class Ujian23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 1.000 and 9.999 : ");
        int masukan = input.nextInt();

        int satuan = masukan % 10;
        int puluhan = (masukan / 10) % 10;
        int ratusan = (masukan / 100) % 10;
        int ribuan = (masukan / 1000) % 10;

        int hasil = satuan + puluhan + ratusan + ribuan;
        System.out.print("Jumlah dari ke empat masukan tersebut adalah " + hasil );
    }
}
