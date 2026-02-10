package jobsheet1;
public class PraktikumFungsi {
    static String[] bunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    static int jumlahCabang = 4;
    static int[][] stok = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };

    static double[] hargaBunga = {75_000, 50_000, 60_000, 10_000};

    public static void tampilPendapatan(){
        double[] pendapatanCabang = new double[jumlahCabang];

        for (int i = 0; i < jumlahCabang; i++) {
            double penjualanAglonema = stok[i][0] * hargaBunga[0];
            double penjualanKeladi = stok[i][1] * hargaBunga[1];
            double penjualanAlocasia = stok[i][2] * hargaBunga[2];
            double penjualanMawar = stok[i][3] * hargaBunga[3];

            pendapatanCabang[i] = penjualanAglonema + penjualanKeladi + penjualanAlocasia + penjualanMawar;
        }
        
        for (int i = 0; i < jumlahCabang; i++) {
            System.out.print("RoyalGarden" + (i+1) + ": Rp." + pendapatanCabang[i]);
            if(pendapatanCabang[i] > 1_500_000){
                System.out.println(" (Status: Sangat Baik)");
            }else{
                System.out.println(" (Status: Perlu Evaluasi)");
            }
        }
    }
    public static void main(String[] args) {
        tampilPendapatan();
    }
}
