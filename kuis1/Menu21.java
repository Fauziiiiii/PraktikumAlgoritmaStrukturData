package kuis1;

public class Menu21 {
    String idMenu;
    String nama;
    double harga;
    int jumlah;
    String kategori;

    public Menu21(){

    }
    
    public Menu21(String idMenu, String nama, double harga, int jumlah, String kategori){
        this.idMenu = idMenu;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
        this.kategori = kategori;
    }

    void cetakMenu(){
        System.out.println("ID Menu     : " + idMenu);
        System.out.println("Nama        : " + nama);
        System.out.println("Harga       : " + harga);
        System.out.println("Jumlah      : " + jumlah);
        System.out.println("Kategori    : " + kategori);
    }

}
