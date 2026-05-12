package jobsheet12;

import java.util.Scanner;

public class DoubledLinkedListMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DoubleLinkedList21 list = new DoubleLinkedList21();

        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah Data di Akhir");
            System.out.println("3. Sisipkan Data di Tengah (Setelah NIM)");
            System.out.println("4. Hapus Data di Awal");
            System.out.println("5. Hapus Data di Akhir");
            System.out.println("6. Tampilkan Data");
            System.out.println("7. Tampilkan Data (Reverse)");
            System.out.println("0. Keluar");

            System.out.print("Pilih menu : ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {

                case 1:
                    Mahasiswa21 mhsAwal = inputMahasiswa(scan);
                    list.addFirst(mhsAwal);
                    break;

                case 2:
                    Mahasiswa21 mhsAkhir = inputMahasiswa(scan);
                    list.addLast(mhsAkhir);
                    break;

                case 3:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String keyNIM = scan.nextLine();

                    System.out.println("Masukkan Data Baru: ");
                    Mahasiswa21 dataBaru = inputMahasiswa(scan);
                    list.insertAfter(keyNIM, dataBaru);
                    break;

                case 4:
                    list.removeFirst();
                    break;

                case 5:
                    list.removeLast();
                    break;

                case 6:
                    list.print();
                    break;

                case 7:
                    list.printReverse();
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak valid");
            }

        } while (pilihan != 0);
    }

    public static Mahasiswa21 inputMahasiswa(Scanner scan){
        System.out.print("Masukkan NIM   : ");
        String nim = scan.nextLine();

        System.out.print("Masukkan Nama  : ");
        String nama = scan.nextLine();

        System.out.print("Masukkan Kelas : ");
        String kelas = scan.nextLine();

        System.out.print("Masukkan IPK   : ");
        double ipk = scan.nextDouble();

        Mahasiswa21 data = new Mahasiswa21(nim, nama, kelas, ipk);

        return data;
    }
}
