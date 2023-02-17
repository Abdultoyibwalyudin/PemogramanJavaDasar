package Chapter8.Ujian;

import java.util.Scanner;

public class Ujianarray1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] nil = new int[10][10];

        System.out.println("\n=====Program Aplikasi Rekap Nilai=====");
        System.out.print("Masukan jumlah siswa: ");
        String[] siswa = new String[input.nextInt()];
        System.out.print("Masukan jumlah mata pelajaran: ");
        String[] mapel = new String[input.nextInt()];
        double nilai;

        System.out.println("\n=====INPUT MATA PELAJARAN=====");
        for (int i = 0; i < mapel.length; i++) {
            System.out.print("Masukan mata pelajaran " + (i + 1) + ": ");
            mapel[i] = input.next();
        }
        System.out.println("\n=====INPUT SISWA DAN NILAI SETIAP MATA PELAJARA=====");
        for (int i = 0; i < siswa.length; i++) {
            System.out.print("Masukan nama siswa " + (i + 1) + ": ");
            siswa[i] = input.next();
            for (int j = 0; j < mapel.length; j++) {

                System.out.print("Masukan nilai " + mapel[j] + ": ");
                int[] jml = new int[input.nextInt()];
            }
        }
        System.out.print("\n======= DATA NILAI SISWA =======");
        System.out.println("\n----------------------------------------------------|");
        System.out.println("NO | NAMA| MTK| FSK| BLG | IFK | EMI | INDEX | KET |");
        System.out.println("------------------------------------------------------|");
        for(int i = 0; i < siswa.length;i++){
            System.out.print((i + 1)+"\t" + siswa[i] + "\t");
            for(int j = 0; j < 7; j++){
                System.out.print(nil[i][j] + "\t");
            }

            nilai=0.3*nil[i][0]+0.3*nil[i][1]+0.4*nil[i][2];
            if(nilai>=80)
                System.out.println("A" + "\t" + "LULUS PUJIAN");
            else if(nilai>=70)
                System.out.println("B" + "\t" + "LULUS");
            else if(nilai>=60)
                System.out.println("C" + "\t" + "LULUS");
            else if(nilai>=50)
                System.out.println("D" + "\t" + "LULUS SYARAT");
            else if(nilai<50)
                System.out.println("E" + "\t" + "TIDAK LULUS");

        }
        System.out.println("----------------------------------------------------|");

    }
}
