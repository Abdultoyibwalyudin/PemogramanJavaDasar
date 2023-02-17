package Chapter8.Ujian;

import java.util.Scanner;

public class Ujian2{
    public static void main(String[] args) {
        String[] nama;

        int n;
        int I;
        Scanner input = new Scanner(System.in);
        System.out.println("=======PROGRAM REKAP NILAI SISWA=======");
        System.out.print("Masukkan jumlah siswa: ");
        n = input.nextInt();
        System.out.print("Masukkan jumlah mata pelajaran: ");
        I = input.nextInt();
        input.nextLine();
        nama = new String[n];
        double nilai;
        String grade="";

        int[][] nil =new int[n][5];
        for( int i = 0; i < n; i++ ){
            System.out.print("Mahasiswa ke-" + (i+1) + "\t" +  "Nama: ");
            nama[i] = input.nextLine();
            System.out.print("MTK        : ");
            nil[i][0]= input.nextInt();
            System.out.print("FISIKA     : ");
            nil[i][1]= input.nextInt();
            System.out.print("BIOLOGI    : ");
            nil[i][2]= input.nextInt();
            System.out.print("INFORMATIKA: ");
            nil[i][3]= input.nextInt();
            System.out.print("EKONOMI    : ");
            nil[i][4]= input.nextInt();
            input.nextLine();
        }
        System.out.print("======= DATA NILAI SISWA =======");
        System.out.println("\n--------------------------------------------|");
        System.out.println("NO\tNAMA| MTK| FSK| BLG| IFK| EMI| INDEX | KET|");
        System.out.println("----------------------------------------------|");
        for(int i=0;i<nama.length;i++){
            System.out.print((i+1)+"\t"+nama[i]+"\t");
            for(int j=0;j < 5; j++){
                System.out.print(nil[i][j]+"\t");
            }

            nilai=0.3*nil[i][0]+0.3*nil[i][1]+0.4*nil[i][2];
            if(nilai>=80) grade="A" + "\t" + "LULUS PUJIAN" ;
            else if(nilai>=70) grade="B" + "\t" + "LULUS" ;
            else if(nilai>=60) grade="C" + "\t" + "LULUS" ;
            else if(nilai>=50) grade="D" + "\t" + "LULUS SYARAT" ;
            else if(nilai<50) grade="E" + "\t" + "TIDAK LULUS" ;

            System.out.println(nilai+"\t"+grade);
        }
        System.out.println("------------------------------------------------|");

    }
}
