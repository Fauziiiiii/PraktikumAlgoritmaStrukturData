package Praktikum05;

import java.util.Scanner;

public class DosenDemo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen21 list = new DataDosen21();

        int pilih;

        do {
            System.out.println("\n=== MENU DATA DOSEN ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Usia termuda -> tertua)");
            System.out.println("4. Sorting DSC (Usia tertua -> termuda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch(pilih){
                case 1:
                    System.out.print("\nKode   : ");
                    String kd = sc.nextLine();

                    System.out.print("Nama   : ");
                    String nm = sc.nextLine();

                    System.out.print("Jenis Kelamin (L/P): ");
                    char jkInput = sc.next().charAt(0);
                    boolean jk = (jkInput == 'L' || jkInput == 'l');

                    System.out.print("Usia   : ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    Dosen21 d = new Dosen21(kd, nm, jk, usia);
                    list.tambah(d);
                    break;

                case 2:
                    list.tampil();
                    break;

                case 3:
                    list.SortingASC();
                    list.tampil();
                    break;

                case 4:
                    list.SortingDSC();
                    list.tampil();
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }

        } while(pilih != 5);

        sc.close();
    }
}
