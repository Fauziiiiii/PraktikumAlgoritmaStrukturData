package CM1;

import java.util.Scanner;

public class PeminjamanDemo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        DataPeminjaman21 data = new DataPeminjaman21();

        int menu;

        do{
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    data.tampilSemuaMahasiswa();
                    break;

                case 2:
                    data.tampilSemuaBuku();
                    break;

                case 3:
                    data.tampilSemuaPeminjaman();
                    break;

                case 4:
                    data.sortPeminjamanByDenda();
                    data.tampilSemuaPeminjaman();
                    break;

                case 5:
                    data.sortPeminjamanByNIM();
                    data.tampilSemuaPeminjaman();
                    
                    data.inputMenu5();
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("\nInput menu dari 0-5 saja");
                    break;
            }
        }while(menu != 0);

        sc.close();
    }
}
