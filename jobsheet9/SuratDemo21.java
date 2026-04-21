package jobsheet9;

import java.util.Scanner;

public class SuratDemo21 {
    public static void main(String[] args) {
        StackSurat21 stack = new StackSurat21(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do{
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat by Nama Mahasiswa");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();
            
            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String idSurat = scan.nextLine();

                    System.out.print("Nama Mahasiswa: ");
                    String namaMhs = scan.nextLine();

                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();

                    System.out.print("Jenis Izin (S/I): ");
                    char jenisIzin = scan.next().charAt(0);

                    System.out.print("Durasi: ");
                    int durasi = scan.nextInt();
                    scan.nextLine();

                    Surat21 surat = new Surat21(idSurat, namaMhs, kelas, jenisIzin, durasi);
                    stack.push(surat);
                    System.out.println("Surat berhasil ditambahkan");
                    break;

                case 2:
                    Surat21 cekTerbaru = stack.peek(); 
                    
                    if (cekTerbaru != null) {
                        System.out.println("Surat yang akan diverifikasi:");
                        cekTerbaru.tampil();

                        System.out.print("Verifikasi surat ini? (y/n): ");
                        char konfirmasi = scan.next().charAt(0);

                        if (konfirmasi == 'y' || konfirmasi == 'Y') {
                            stack.pop();
                            System.out.println("Surat berhasil diverifikasi");
                        } else {
                            System.out.println("Surat tidak jadi diverifikasi");
                        }
                    }
                    break;

                case 3:
                    Surat21 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir:");
                        lihat.tampil();
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cari = scan.nextLine();
                    Surat21 hasil = stack.searchSuratByNamaMhs(cari);
                    if(hasil != null){
                        hasil.tampil();
                    }
                    break;
            
                default:
                    break;
            }

        }while(pilih >= 1 && pilih <= 4);

        scan.close();
    }
}
