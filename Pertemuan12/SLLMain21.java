package Pertemuan12;

import java.util.Scanner;

public class SLLMain21 {
    public static void main(String[] args) {

        Mahasiswa21 mhs1 = new Mahasiswa21("123", "Fauzi", "TI-1G", 3.1);
        Mahasiswa21 mhs2 = new Mahasiswa21("124", "Bimon", "TI-1B", 3.2);
        Mahasiswa21 mhs3 = new Mahasiswa21("125", "Cintia", "TI-1V", 3.6);
        Mahasiswa21 mhs4 = new Mahasiswa21("126", "Dirga", "TI-1A", 3.5);

        SingleLinkedList21 sll = new SingleLinkedList21();

        // sll.print();

        // sll.addFirst(mhs4);
        // sll.print();

        // sll.addLast(mhs1);
        // sll.print();

        // sll.insertAfter("Dirga", mhs3);

        // sll.insertAt(2, mhs2);

        // sll.print();

        // System.out.println("Data index 1: ");
        // sll.getData(1);

        // System.out.println("Data mahasiswa an Bimon berada pada index: " + sll.indexOf("bimon"));
        // System.out.println();

        // sll.removeFirst();
        // sll.removeLast();
        // sll.print();
        // sll.removeAt(0);
        // sll.print();


        // SingleLinkedList21 sll = new SingleLinkedList21();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        
        do {
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa baru ke awal (add first)");
            System.out.println("2. Tambah Mahasiswa baru ke akhir (add last)");
            System.out.println("3. Tambah Mahasiswa baru setelah Nama Mahasiswa tertentu (insert after)");
            System.out.println("4. Tambah Mahasiswa baru pada index tertentu (at index)");
            System.out.println("5. Tampilkan Semua Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    Mahasiswa21 dataFirst = inputDataMhs();

                    sll.addFirst(dataFirst);
                    break;

                case 2:
                    Mahasiswa21 dataLast = inputDataMhs();

                    sll.addLast(dataLast);
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Masukkan nama mahasiswa sebagai key:\t");
                    String keyNamaMhs = sc.nextLine();

                    System.out.println("\nData Mahasiswa baru akan ditambah setelah data mahasiswa dengan nama: " + keyNamaMhs);
                    Mahasiswa21 dataAfter = inputDataMhs();

                    sll.insertAfter(keyNamaMhs, dataAfter);
                    break;

                case 4:
                    System.out.print("Masukkan index:\t");
                    int index = sc.nextInt();

                    System.out.println("\nData Mahasiswa baru akan ditambah di index: " + index);
                    Mahasiswa21 dataAtIndex = inputDataMhs();

                    sll.insertAt(index, dataAtIndex);
                    break;

                case 5:
                    sll.print();
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
