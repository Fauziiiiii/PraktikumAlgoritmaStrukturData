package jobsheet12;

public class Mahasiswa21 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa21(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampil() {
        System.out.println(
            "NIM      : " + nim + 
            "\nNama   : " + nama + 
            "\nKelas  : " + kelas +
            "\nIPK    : " + ipk
        );
    }
}
