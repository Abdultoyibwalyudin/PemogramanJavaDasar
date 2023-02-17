package Chapter8.Ujian;

import java.util.Scanner;

public class Ujian1 {
    public static void main(String[] args) {
        String[] nama;

        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("MASUKAN DATA ");
        System.out.print("Jumlah Siswa : ");
        n = input.nextInt();
        input.nextLine();
        nama = new String[n];
        double nilai;
        String grade="";

        int[][] nil =new int[n][3];
        for( int i = 0; i < n; i++ ){
            System.out.print("Mahasiswa ke-" + (i+1) + ": ");
            System.out.print("Nama = ");
            nama[i] = input.nextLine();
            System.out.print("Tugas = ");
            nil[i][0]= input.nextInt();
            System.out.print("UTS = ");
            nil[i][1]= input.nextInt();
            System.out.print("UAS = ");
            nil[i][2]= input.nextInt();
            input.nextLine();
        }
        System.out.println(" MENAMPILKAN DATA NILAI MAHASISWA");
        System.out.println(" Menggunakan Array 2 Dimensi");
        System.out.println("-------------------------------------------------------");
        System.out.println("NO\tNAMA\tTUGAS\tUTS\tUAS\tNA\tGRADE");
        System.out.println("-------------------------------------------------------");
        for(int i=0;i<nama.length;i++){
            System.out.print((i+1)+"\t"+nama[i]+"\t");
            for(int j=0;j<3; j++){
                System.out.print(nil[i][j]+"\t");
            }

            nilai=0.3*nil[i][0]+0.3*nil[i][1]+0.4*nil[i][2];
            if(nilai>=80) grade="A" ;
            else if(nilai>=70) grade="B" ;
            else if(nilai>=60) grade="C" ;
            else if(nilai>=50) grade="D" ;
            else if(nilai<50) grade="E" ;

            System.out.println(nilai+"\t"+grade);
        }
        System.out.println("-------------------------------------------------------");

    }
}
