package CM2Kuis;

import java.util.Scanner;

public class DLLMain21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLLPembeli21 antrian = new DLLPembeli21();
        DLLPesanan21 pesanan = new DLLPesanan21();
        int menu;
        int nomorAntrian = 1;

        do {
            System.out.println("\n==============================");
            System.out.println(" SISTEM ANTIRAN ROYAL DELISH ");
            System.out.println("==============================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian & Input Pesanan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.println("==============================");

            System.out.print("Pilih menu : ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("\nTambah Antrian");
                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();

                    System.out.print("No HP        : ");
                    String hp = sc.nextLine();

                    Pembeli21 p = new Pembeli21(nomorAntrian, nama, hp);
                    antrian.addLast(p);
                    System.out.println("Nomor Antrian : " + nomorAntrian);
                    nomorAntrian++;
                    break;

                case 2:
                    System.out.println("\nDaftar Antrian");
                    antrian.print();
                    break;

                case 3:
                    Pembeli21 dipanggil = antrian.removeFirst();
                    System.out.println("\nPanggil Antrian");

                    if (dipanggil != null) {
                        System.out.println("Pembeli dipanggil:");
                        System.out.println("--------------------------------");
                        dipanggil.tampilPembeli();
                        System.out.println("--------------------------------");

                        System.out.print("Kode Pesanan : ");
                        int kode = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nama Pesanan : ");
                        String namaPesanan = sc.nextLine();

                        System.out.print("Harga        : ");
                        int harga = sc.nextInt();
                        sc.nextLine();

                        Pesanan21 ps = new Pesanan21(kode, namaPesanan, harga, dipanggil.namaPembeli);
                        pesanan.addLast(ps);
                        System.out.println("Pesanan berhasil ditambahkan");
                    }
                    break;

                case 4:
                    System.out.println("\nLaporan Pesanan");
                    pesanan.print();
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak tersedia");
            }

        } while(menu != 0);
    }
}
