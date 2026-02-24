package jobsheet3;

import java.util.Scanner;

public class MatakuliahDemo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah21[] arrayOfMatakuliah = new Matakuliah21[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        arrayOfMatakuliah[0] = new Matakuliah21("", "", 0, 0);
        arrayOfMatakuliah[0].tambahData("PASD", "Praktikum Algoritma dan Struktur Data", 6, 6);

        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("SKS        : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("------------------------------");

            arrayOfMatakuliah[i] = new Matakuliah21(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
            System.out.println("------------------------------");
        }

        sc.close();
    }
}
