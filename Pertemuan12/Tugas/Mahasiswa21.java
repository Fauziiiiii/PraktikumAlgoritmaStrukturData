package Pertemuan12.Tugas;

public class Mahasiswa21 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa21(){}

    Mahasiswa21(String nim, String nama, String kls, double ip){
        this.nim = nim;
        this.nama = nama;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi(){
        System.out.println(nama + "\t\t" + nim + "\t\t" + kelas + "\t\t" + ipk);
    }
}
