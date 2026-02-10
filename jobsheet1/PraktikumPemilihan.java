package jobsheet1;

import java.util.Scanner;

public class PraktikumPemilihan {
    public static double HitungNilai(double tugas, double kuis, double uts, double uas){
        double nilaiAkhir;

        nilaiAkhir = (tugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.3);

        return nilaiAkhir;
    }

    public static String HitungNilaiHuruf(double nilaiAkhir){
        if(nilaiAkhir <= 100 && nilaiAkhir > 80){
            return "A";
        }else if(nilaiAkhir <= 80 && nilaiAkhir > 73){
            return "B+";
        }else if(nilaiAkhir <= 73 && nilaiAkhir > 65){
            return "B";
        }else if(nilaiAkhir <= 65 && nilaiAkhir > 60){
            return "C+";
        }else if(nilaiAkhir <= 60 && nilaiAkhir > 50){
            return "C";
        }else if(nilaiAkhir <= 50 && nilaiAkhir > 39){
            return "D";
        }else if(nilaiAkhir <= 39 && nilaiAkhir >= 0){
            return "E";
        }else{
            return "Tidak Valid";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tugas, kuis, uts, uas;
        int counter = 0;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("======================");

        System.out.print("Masukkan Nilai Tugas: ");
        tugas = sc.nextDouble();

        System.out.print("Masukkan Nilai Kuis: ");
        kuis = sc.nextDouble();

        System.out.print("Masukkan Nilai UTS: ");
        uts = sc.nextDouble();

        System.out.print("Masukkan Nilai UAS: ");
        uas = sc.nextDouble();

        if(tugas > 100 || tugas < 0){
            counter++;
        }else if(kuis > 100 || tugas < 0){
            counter++;
        }else if(uts > 100 || tugas < 0){
            counter++;
        }else if(uas > 100 || tugas < 0){
            counter++;
        }

        double nilaiAkhir = HitungNilai(tugas, kuis, uts, uas);
        String nilaiHuruf = HitungNilaiHuruf(nilaiAkhir);

        if(counter > 0){
            System.out.println("======================");
            System.out.println("======================");
            System.out.println("nilai tidak valid (nilai 0-100 saja)");
            System.out.println("======================");
            System.out.println("======================");
        }else{
            System.out.println("======================");
            System.out.println("======================");
            System.out.println("Nilai Akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
            System.out.println("======================");
            System.out.println("======================");
            
            if(nilaiAkhir > 50){
                System.out.println("SELAMAT ANDA LULUS");
            }else{
                System.out.println("MAAF ANDA TIDAK LULUS");
            }
        }
    }
}
