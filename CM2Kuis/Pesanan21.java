package CM2Kuis;

public class Pesanan21 {
    int kodePesanan;
    String namaPesanan;
    int harga;
    String namaPembeli;

    public Pesanan21(int kodePesanan, String namaPesanan,int harga, String namaPembeli) {
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
        this.namaPembeli = namaPembeli;
    }

    void tampilPesanan() {
        System.out.printf("%-10d %-20s %-15d %-20s\n",
                kodePesanan,
                namaPesanan,
                harga,
                namaPembeli);
    }
}

