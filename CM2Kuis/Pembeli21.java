package CM2Kuis;

public class Pembeli21 {
    int noAntrian;
    String namaPembeli;
    String noHp;

    public Pembeli21(int noAntrian, String namaPembeli, String noHp) {
        this.noAntrian = noAntrian;
        this.namaPembeli = namaPembeli;
        this.noHp = noHp;
    }

    void tampilPembeli() {
        System.out.printf("%-10d %-20s %-15s\n",
                noAntrian, namaPembeli, noHp);
    }
}