package Pertemuan12.Tugas;

import java.util.Scanner;

public class SLLMain21 {
    public static void main(String[] args) {
        SingleLinkedList21 sll = new SingleLinkedList21(5);

        Scanner sc = new Scanner(System.in);
        int pilihan;

        
        do {
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Tampilkan Semua");
            System.out.println("4. Lihat Depan & Belakang");
            System.out.println("5. Jumlah Antrian");
            System.out.println("6. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    sll.enqueue(inputDataMhs());
                    break;
                case 2:
                    sll.dequeue();
                    break;
                case 3:
                    sll.print();
                    break;
                case 4:
                    sll.peekFront();
                    sll.peekRear();
                    break;
                case 5:
                    sll.jumlah();
                    break;
                case 6:
                    sll.clear();
                    break;

                default:
                    break;
            }
        } while (pilihan != 0);

    }

    public static Mahasiswa21 inputDataMhs(){
        Scanner sc = new Scanner(System.in);
        System.out.print("NIM     : ");
        String nim = sc.nextLine();

        System.out.print("Nama    : ");
        String nama = sc.nextLine();

        System.out.print("Kelas   : ");
        String kelas = sc.nextLine();

        System.out.print("IPK   : ");
        Double ipk = sc.nextDouble(); sc.nextLine();

        Mahasiswa21 mhs = new Mahasiswa21(nim, nama, kelas, ipk);

        return mhs;
    }
}
