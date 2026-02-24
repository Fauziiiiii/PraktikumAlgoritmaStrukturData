package jobsheet3;

import java.util.Scanner;

public class DosenDemo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = sc.nextInt();
        sc.nextLine();

        Dosen21[] arrayOfDosen = new Dosen21[jumlahDosen];
        String kode, nama;
        Boolean jenisKelamin;
        int usia;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin (true=Pria, false=Wanita): ");
            jenisKelamin = sc.nextBoolean();
            System.out.print("Usia          : ");
            usia = sc.nextInt();
            sc.nextLine();
            System.out.println("------------------------------");
            
            arrayOfDosen[i] = new Dosen21(kode, nama, jenisKelamin, usia);
        }

        DataDosen21 data21 = new DataDosen21();

        System.out.println("\nData Semua Dosen");
        System.out.println("------------------------------");
        data21.dataSemuaDosen(arrayOfDosen);

        data21.jumlahDosenPerJenisKelamin(arrayOfDosen);
        data21.rataRataUsiaDosenPerJenisKelamin(arrayOfDosen);
        data21.infoDosenPalingTua(arrayOfDosen);
        data21.infoDosenPalingMuda(arrayOfDosen);

        sc.close();
    }
}
