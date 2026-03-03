package kuis1;

import java.util.Scanner;

public class DataMenu21 {
    static Scanner sc = new Scanner(System.in);
    static Menu21[] arrayOfMenu = new Menu21[5];

    void cetakSemuaMenu(){
        int i = 1;
        if(arrayOfMenu[0] == null){
            System.out.println("Menu kosong");
        }else{
            for (Menu21 menu : arrayOfMenu) {
                if(menu.idMenu.equalsIgnoreCase(null)){
                }else{
                    System.out.println("Menu ke-" + i++);
                    menu.cetakMenu();
                }
            }
        }
    }

    void tambahMenu(){
        int noId = 1;
        for (int i = 0; i < arrayOfMenu.length; i++) {
            String idMenu = "MENU" + noId;
            System.out.println("Masukkan Data Menu ke-" + (i + 1));
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            System.out.print("Harga         : ");
            double harga = sc.nextDouble();
            System.out.print("Jumlah        : ");
            int jumlah = sc.nextInt();
            sc.nextLine();
            System.out.print("Kategori      : ");
            String kategori = sc.nextLine();
            System.out.println("------------------------------");
            
            arrayOfMenu[i] = new Menu21(idMenu, nama, harga, jumlah, kategori);
            noId++;
        }
    }

    void hapusMenu(){
        int indexMenu = -1;

        cetakSemuaMenu();
        System.out.print("Pilih ID Menu yang akan dihapus: ");
        String inputIdMenu = sc.nextLine();

        if(arrayOfMenu[0] == null){
            System.out.println("Data menu masih kosong");
        }

        for (int i = 0; i < arrayOfMenu.length; i++) {
            if(arrayOfMenu[i].idMenu.equalsIgnoreCase(inputIdMenu)){
                indexMenu = i;
                break;
            }
        }

        if(indexMenu == -1){
            System.out.println("ID " + inputIdMenu + " tidak ditemukan");
            return;
        }

        for (int i = indexMenu; i < arrayOfMenu.length - 1; i++) {
            arrayOfMenu[i].idMenu = arrayOfMenu[i+1].idMenu;
            arrayOfMenu[i].nama = arrayOfMenu[i+1].nama;
            arrayOfMenu[i].harga = arrayOfMenu[i+1].harga;
            arrayOfMenu[i].jumlah = arrayOfMenu[i+1].jumlah;
            arrayOfMenu[i].kategori = arrayOfMenu[i+1].kategori;
        }

        for (int i = 0; i < arrayOfMenu.length; i++) {
            arrayOfMenu[arrayOfMenu.length - 1].idMenu = "";
            arrayOfMenu[arrayOfMenu.length - 1].nama = "";
            arrayOfMenu[arrayOfMenu.length - 1].harga = 0;
            arrayOfMenu[arrayOfMenu.length - 1].jumlah = 0;
            arrayOfMenu[arrayOfMenu.length - 1].kategori = "";
        }

        System.out.println("data berhasil dihapus");
    }
}
