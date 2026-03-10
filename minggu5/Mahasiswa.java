package minggu5;

public class Mahasiswa {
    String nama;
    String nim;
    int tahunMasuk;
    int uts;
    int uas;

    public Mahasiswa(String nama, String nim, int tahunMasuk, int uts, int uas) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.uts = uts;
        this.uas = uas;
    }

    public void tampilData() {
        System.out.println("Nama        : " + nama);
        System.out.println("NIM         : " + nim);
        System.out.println("Tahun Masuk : " + tahunMasuk);
        System.out.println("UTS         : " + uts);
        System.out.println("UAS         : " + uas);
    }

}