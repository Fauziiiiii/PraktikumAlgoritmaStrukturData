package CM1;

public class Peminjaman21 {
    Mahasiswa21 mhs;
    Buku21 buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;

    Peminjaman21(){}
    
    Peminjaman21(Mahasiswa21 mhs, Buku21 buku, int lamaPinjam){
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    void tampilPeminjaman(){
        System.out.println("NIM\t\t: " + mhs.nim);
        System.out.println("Nama\t\t: " + mhs.nama);
        System.out.println("Judul Buku\t: " + buku.judul);
        System.out.println("Lama Pinjam\t: " + lamaPinjam);
        System.out.println("Denda\t\t: " + denda);
    }

    void hitungDenda(){
        int dendaPerHari = 2000;

        if(lamaPinjam > batasPinjam){
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * dendaPerHari;
        }else{
            denda = 0;
        }
    }

}
