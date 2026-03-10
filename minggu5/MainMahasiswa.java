package minggu5;

public class MainMahasiswa {
    public static void main(String[] args) {
        Mahasiswa[] mahasiswa = {
            new Mahasiswa("Ahmad", "220101001", 2022, 78, 82),
            new Mahasiswa("Budi",  "220101002", 2022, 85, 88),
            new Mahasiswa("Cindy", "220101003", 2021, 90, 87),
            new Mahasiswa("Dian",  "220101004", 2021, 76, 79),
            new Mahasiswa("Eko",   "220101005", 2023, 92, 95),
            new Mahasiswa("Fajar", "220101006", 2020, 88, 85),
            new Mahasiswa("Gina",  "220101007", 2023, 80, 83),
            new Mahasiswa("Hadi",  "220101008", 2020, 82, 84)
        };

        DataMahasiswa data = new DataMahasiswa();

        int utsTertinggi = data.maxUTSDC(mahasiswa, 0, mahasiswa.length - 1);
        int utsTerendah = data.minUTSDC(mahasiswa, 0, mahasiswa.length - 1);
        double rataUAS = data.rataUASBF(mahasiswa);

        System.out.println("=== HASIL LATIHAN PRAKTIKUM ===");
        System.out.println("Nilai UTS tertinggi : " + utsTertinggi);
        data.tampilkanMahasiswaUTSTertinggi(mahasiswa, utsTertinggi);

        System.out.println("Nilai UTS terendah  : " + utsTerendah);
        data.tampilkanMahasiswaUTSTerendah(mahasiswa, utsTerendah);

        System.out.println("Rata-rata nilai UAS : " + rataUAS);
    }
}
