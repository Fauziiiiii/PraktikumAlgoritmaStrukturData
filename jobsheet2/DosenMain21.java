package jobsheet2;

public class DosenMain21 {
    public static void main(String[] args) {
        // Objek 1 (Konstruktor default)
        Dosen21 dsn1 = new Dosen21();
        dsn1.idDosen = "MQ";
        dsn1.nama = "Mungki Astiningrum, ST, M.Kom";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2005;
        dsn1.bidangKeahlian = "Ketua Jurusan Teknologi Informasi";

        System.out.println("Dosen 1");
        dsn1.tampilInformasi();
        dsn1.setStatusAktif(true);
        System.out.println("Masa Kerja: " + dsn1.hitungMasaKerja(2026) + " tahun");
        dsn1.ubahKeahlian("Keamanan Siber");

        System.out.println("\nDosen 2");
        Dosen21 dsn2 = new Dosen21("RR", "Ridwan Rismanto, S.ST, M.Kom, Ph.D", true, 2011, "Kecerdasan Buatan");
        dsn2.tampilInformasi();
        System.out.println("Masa Kerja: " + dsn2.hitungMasaKerja(2026) + " tahun");
    }
}
