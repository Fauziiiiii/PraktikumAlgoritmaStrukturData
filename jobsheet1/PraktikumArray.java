package jobsheet1;

import java.util.Scanner;

public class PraktikumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String[] MK = {"Pancasila", "Konsep Teknologi Informasi" + "Critical Thinking dan Problem Solving", "Matematika Dasar", 
        // "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};
        String[] MK = new String[8];
        double[][] NilaiMK = new double[MK.length][3]; // 8 baris matkul, dan 3 kolom (nilai angka, bobot sks, nilai setara)
        String[] NilaiHuruf = new String[MK.length];
        double totalSKS = 0;
        double totalNilai = 0;
        double IP = 0;
        
        System.out.println("======================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("======================");

        for (int i = 0; i < MK.length; i++) {
            while (true) {
                System.out.print("Masukkan nama Mata Kuliah: ");
                MK[i] = sc.nextLine();
                
                // System.out.print("Masukkan nilai Angka untuk MK " + MK[i] + ": ");
                System.out.print("Masukkan nilai Angka: ");
                NilaiMK[i][0] = sc.nextDouble();

                System.out.print("Masukkan bobot SKS: ");
                NilaiMK[i][1] = sc.nextDouble();

                sc.nextLine();

                if(NilaiMK[i][0] <= 100 && NilaiMK[i][0] >= 0){
                    break;
                }else{
                    System.out.println("Input tidak valid. Masukkan nilai (0 - 100)");
                }
            }

            if(NilaiMK[i][0] <= 100 && NilaiMK[i][0] > 80){
                NilaiMK[i][2] = 4; // 
                NilaiHuruf[i] = "A";
            }else if(NilaiMK[i][0] <= 80 && NilaiMK[i][0] > 73){
                NilaiMK[i][2] = 3.5;
                NilaiHuruf[i] = "B+";
            }else if(NilaiMK[i][0] <= 73 && NilaiMK[i][0] > 65){
                NilaiMK[i][2] = 3;
                NilaiHuruf[i] = "B";
            }else if(NilaiMK[i][0] <= 65 && NilaiMK[i][0] > 60){
                NilaiMK[i][2] = 2.5;
                NilaiHuruf[i] = "C+";
            }else if(NilaiMK[i][0] <= 60 && NilaiMK[i][0] > 50){
                NilaiMK[i][2] = 2;
                NilaiHuruf[i] = "C";
            }else if(NilaiMK[i][0] <= 50 && NilaiMK[i][0] > 39){
                NilaiMK[i][2] = 1;
                NilaiHuruf[i] = "D";
            }else if(NilaiMK[i][0] <= 39 && NilaiMK[i][0] >= 0){
                NilaiMK[i][2] = 0;
                NilaiHuruf[i] = "E";
            }else{
                NilaiHuruf[i] = "Tidak Valid";
            }
        }
        
        for (int i = 0; i < MK.length; i++) {
            totalSKS += NilaiMK[i][1];
            totalNilai += NilaiMK[i][1] * NilaiMK[i][2]; // bobot sks * nilai setara
        }

        IP = totalNilai / totalSKS;

        System.out.println("======================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("======================");

        System.out.printf("%-60s %-12s %-12s %-12s%n",
                "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < MK.length; i++) {
            System.out.printf("%-60s %-12.2f %-12s %-12.2f%n",
                    MK[i], NilaiMK[i][0], NilaiHuruf[i], NilaiMK[i][2]);
        }
        System.out.println("======================");
        System.out.println("IP:\t" + IP);
    }
}