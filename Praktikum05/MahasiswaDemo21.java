package Praktikum05;

import java.util.Scanner;

public class MahasiswaDemo21 {
    public static void main(String[] args) {
        // MahasiswaBerprestasi21 list = new MahasiswaBerprestasi21();
        // Mahasiswa21 m1 = new Mahasiswa21("123", "Zidan", "2A", 3.2);
        // Mahasiswa21 m2 = new Mahasiswa21("124", "Ayu", "2A", 3.5);
        // Mahasiswa21 m3 = new Mahasiswa21("125", "Sofi", "2A", 3.1);
        // Mahasiswa21 m4 = new Mahasiswa21("126", "Sita", "2A", 3.9);
        // Mahasiswa21 m5 = new Mahasiswa21("127", "Miki", "2A", 3.7);

        // list.tambah(m1);
        // list.tambah(m2);
        // list.tambah(m3);
        // list.tambah(m4);
        // list.tambah(m5);
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        MahasiswaBerprestasi21 list = new MahasiswaBerprestasi21();
        list.listMhs = new Mahasiswa21[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data mahasiswa ke-" + (i+1));

            System.out.print("NIM: ");
            String nim = sc.nextLine();

            System.out.print("Nama: ");
            String nama = sc.nextLine();

            System.out.print("Kelas: ");
            String kelas = sc.nextLine();

            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa21 m = new Mahasiswa21(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("Data Mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK menggunakan BUBBLE SORT (DESC) : ");
        list.bubbleSort();
        list.tampil();

        // System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK menggunakan SELECTION SORT (ASC) : ");
        // list.selectionSort();
        // list.tampil();

        // System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK menggunakan INSERTION SORT (ASC) : ");
        // list.insertionSort();
        // list.tampil();

        sc.close();
    }
}
