package TugasJobsheet10;

import java.util.Scanner;

public class LayananKRSMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLayananKRS antrian = new AntrianLayananKRS(10);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Proses 2 KRS Mahasiswa");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat 2 Mahasiswa Terdepan");
            System.out.println("5. Cek Antrian paling Belakang");
            System.out.println("6. Jumlah Mahasiswa dalam Antrian");
            System.out.println("7. Jumlah Mahasiswa yang Sudah Proses KRS");
            System.out.println("8. Jumlah Mahasiswa yang Belum Proses KRS");
            System.out.println("9. Clear Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM     : ");
                    String nim = sc.nextLine();

                    System.out.print("Nama    : ");
                    String nama = sc.nextLine();

                    System.out.print("Prodi   : ");
                    String prodi = sc.nextLine();

                    System.out.print("Kelas   : ");
                    String kelas = sc.nextLine();

                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;

                case 2:
                    antrian.layaniMahasiswa();
                    break;

                case 3:
                    antrian.tampilkanSemua();
                    break;

                case 4:
                    antrian.lihat2Terdepan();
                    break;

                case 5:
                    antrian.lihatAkhir();
                    break;
                    
                case 6:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + antrian.getJumlahAntrian());
                    break;

                case 7:
                    int jumlahSudahProses = antrian.getJumlahMhsSudahProses();
                    if(jumlahSudahProses == 0){
                        System.out.println("Belum ada mahasiswa yang proses KRS");
                    }else{
                        System.out.println("Jumlah mahasiswa yang sudah proses KRS: " + jumlahSudahProses);
                    }
                    break;

                case 8:
                    int jumlahBelumProses = antrian.getJumlahMhsBelumProses();
                    if(jumlahBelumProses == 0){
                        System.out.println("Semua mahasiswa sudah memproses KRS");
                    }else{
                        System.out.println("Jumlah mahasiswa yang belum proses KRS: " + jumlahBelumProses);
                    }
                    break;

                case 9:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Terima kasih.");
                    break;
            
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (pilihan != 0);

        sc.close();
    }
}
