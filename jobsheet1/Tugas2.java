package jobsheet1;

import java.util.Scanner;

public class Tugas2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== PROGRAM MANAJEMEN JADWAL KULIAH ===");

        System.out.print("Masukkan jumlah mata kuliah yang ingin didaftarkan: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal, n);

        boolean running = true;
        while (running) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Tampilkan Seluruh Jadwal");
            System.out.println("2. Cari Jadwal Berdasarkan Hari");
            System.out.println("3. Cari Jadwal Berdasarkan Nama Mata Kuliah");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    tampilkanSeluruhJadwal(jadwal, n);
                    break;
                case 2:
                    System.out.print("Masukkan hari yang ingin dicari (misal: Senin): ");
                    String hariCari = sc.nextLine();
                    tampilkanJadwalPerHari(jadwal, n, hariCari);
                    break;
                case 3:
                    // d. Menampilkan berdasarkan nama matkul
                    System.out.print("Masukkan nama mata kuliah yang dicari: ");
                    String matkulCari = sc.nextLine();
                    cariMataKuliah(jadwal, n, matkulCari);
                    break;
                case 4:
                    System.out.println("Terima kasih, program selesai.");
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    static void inputJadwal(String[][] data, int n) {
        System.out.println("\n--- INPUT DATA JADWAL ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Data ke-" + (i + 1));
            
            System.out.print("Nama Mata Kuliah : ");
            data[i][0] = sc.nextLine();
            
            System.out.print("Ruang            : ");
            data[i][1] = sc.nextLine();
            
            System.out.print("Hari             : ");
            data[i][2] = sc.nextLine();
            
            System.out.print("Jam (mis: 08:00) : ");
            data[i][3] = sc.nextLine();
            
            System.out.println("-------------------------");
        }
    }

    static void tampilkanSeluruhJadwal(String[][] data, int n) {
        System.out.println("\n--- DAFTAR SELURUH JADWAL KULIAH ---");
        System.out.printf("%-25s %-15s %-10s %-15s\n", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("-------------------------------------------------------------------");
        
        for (int i = 0; i < n; i++) {
            System.out.printf("%-25s %-15s %-10s %-15s\n", 
                data[i][0],
                data[i][1],
                data[i][2],
                data[i][3] 
            );
        }
        System.out.println("-------------------------------------------------------------------");
    }

    static void tampilkanJadwalPerHari(String[][] data, int n, String hari) {
        System.out.println("\n--- JADWAL HARI: " + hari.toUpperCase() + " ---");
        boolean ditemukan = false;
        
        System.out.printf("%-25s %-15s %-15s\n", "Mata Kuliah", "Ruang", "Jam");
        System.out.println("-------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            if (data[i][2].equalsIgnoreCase(hari)) {
                System.out.printf("%-25s %-15s %-15s\n", data[i][0], data[i][1], data[i][3]);
                ditemukan = true;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah pada hari " + hari);
        }
        System.out.println("-------------------------------------------------------");
    }

    static void cariMataKuliah(String[][] data, int n, String namaMatkul) {
        System.out.println("\n--- PENCARIAN MATA KULIAH: " + namaMatkul + " ---");
        boolean ditemukan = false;
        
        System.out.printf("%-25s %-15s %-10s %-15s\n", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("-------------------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            if (data[i][0].toLowerCase().contains(namaMatkul.toLowerCase())) {
                System.out.printf("%-25s %-15s %-10s %-15s\n", 
                    data[i][0], data[i][1], data[i][2], data[i][3]
                );
                ditemukan = true;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Mata kuliah \"" + namaMatkul + "\" tidak ditemukan.");
        }
        System.out.println("-------------------------------------------------------------------");
    }
}
