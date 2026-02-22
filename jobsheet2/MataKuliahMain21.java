package jobsheet2;

public class MataKuliahMain21 {
    public static void main(String[] args) {
        MataKuliah21 mk1 = new MataKuliah21();
        mk1.kodeMK = "ASD";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 4;
        mk1.jumlahJam = 4;

        System.out.println("Mata kuliah 1");
        mk1.tampilInformasi();
        mk1.ubahSKS(5);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);

        System.out.println("\nMata kuliah 2");
        MataKuliah21 mk2 = new MataKuliah21("PASD", "Praktikum Algoritma dan Struktur Data", 6, 6);
        mk2.tampilInformasi();
        mk2.kurangiJam(7);
    }
}
