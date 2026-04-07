package CM1;

public class Buku21 {
    String kodeBuku;
    String judul;
    String tahunTerbit;

    Buku21(String kode, String judul, String tahun){
        kodeBuku = kode;
        this.judul = judul;
        tahunTerbit = tahun;
    }

    void tampilBuku(){
        System.out.println("Kode Buku\t: " + kodeBuku);
        System.out.println("Judul\t\t: " + judul);
        System.out.println("Tahun Terbit\t: " + tahunTerbit);
    }
}
