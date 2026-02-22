package jobsheet2;

public class MataKuliah21 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah21() {
    }

    public MataKuliah21(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi(){
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah jam: " + jumlahJam);
    }

    void ubahSKS(int sksBaru){
        sks = sksBaru;
        System.out.println("SKS telah diubah menjadi: " + sks);
    }

    void tambahJam(int jam){
        jumlahJam += jam;
        System.out.println("Jumlah jam saat ini: " + jumlahJam + " jam");
    }

    void kurangiJam(int jam){
        if(jumlahJam >= jam){
            jumlahJam -= jam;
            System.out.println("Pengurangan jam berhasil. Jumlah jam sekarang: " + jumlahJam + " jam");
        }else{
            System.out.println("Pengurangan jam gagal. Sisa jam tidak mencukupi");
        }
    }
}
