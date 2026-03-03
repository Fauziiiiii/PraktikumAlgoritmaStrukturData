package kuis1;

import java.util.Scanner;

public class MenuDemo21 {
    public static void main(String[] args) {
        DataMenu21 data21 = new DataMenu21();

        Scanner sc = new Scanner(System.in);
        boolean proses = true;
        while (proses) {
            int inputProses = 0;
            System.out.println("=== List Proses ===");
            System.out.println("1. Tampilkan Semua Menu");
            System.out.println("2. Tambah Menu");
            System.out.println("3. Hapus Menu");
            System.out.println("4. Keluar");

            System.out.print("Pilih proses: ");
            inputProses = sc.nextInt();
            
            switch (inputProses) {
                case 1:
                    data21.cetakSemuaMenu();
                    break;

                case 2:
                    data21.tambahMenu();
                    break;
                
                case 3:
                    data21.hapusMenu();
                    break;

                case 4:
                    proses = false;
                    break;

                default:
                    break;
            }
        }
        sc.close();
    }
}
