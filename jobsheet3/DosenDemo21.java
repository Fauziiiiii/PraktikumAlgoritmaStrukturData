package jobsheet3;

import java.util.Scanner;

public class DosenDemo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dosen21[] arrayOfDosen = new Dosen21[3];
        String kode, nama, dummy, inputJK;
        Boolean jenisKelamin;
        int usia;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            inputJK = sc.nextLine();
            jenisKelamin = inputJK.equalsIgnoreCase("Pria"); // Pria = true, Wanita = false
            System.out.print("Usia          : ");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("------------------------------");

            arrayOfDosen[i] = new Dosen21(kode, nama, jenisKelamin, usia);
        }

        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode            : " + arrayOfDosen[i].kode);
            System.out.println("Nama            : " + arrayOfDosen[i].nama);
            System.out.println("Jenis Kelamin   : " + (arrayOfDosen[i].jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia            : " + arrayOfDosen[i].usia);
            System.out.println("------------------------------");
        }

        sc.close();
    }
}
