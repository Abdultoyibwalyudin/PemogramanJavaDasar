package Chapter8.Ujian;

import java.util.Scanner;

public class Ujianarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n===Program aplikasi rekap nilai===");
        System.out.print("Masukan jumlah siswa: ");
        int[] siswa = new int[input.nextInt()];
        System.out.print("Masukan jumlah mata pelajaran: ");
        int[] mapel = new int[input.nextInt()];

        System.out.println("\n===Masukan Mata Pelajaran===");
        for (int i = 0; i < siswa.length; i++){
            System.out.print("Masukan mata pelajaran ke " + (i + 1) + ": ");
            siswa[i] = input.nextInt();
        }
    }
}
