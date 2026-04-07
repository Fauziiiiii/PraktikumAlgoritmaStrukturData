package CM1;

public class Mahasiswa21 {
    String nim;
    String nama;
    String prodi;

    Mahasiswa21(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    void tampilMahasiswa(){
        System.out.println("NIM\t\t: " + nim);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Prodi\t\t: " + prodi);
    }
}
