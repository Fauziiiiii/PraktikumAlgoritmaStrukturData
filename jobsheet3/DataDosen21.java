package jobsheet3;

public class DataDosen21 {

    void dataSemuaDosen(Dosen21[] arrayOfDosen) {
        int i = 1;
        for (Dosen21 dosen21 : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + i++);
            dosen21.cetakInfo();
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen21[] arrayOfDosen) {
        int pria = 0;
        int wanita = 0;

        for (Dosen21 dosen21 : arrayOfDosen) {
            if (dosen21.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }

        System.out.println("\nJumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    void rataRataUsiaDosenPerJenisKelamin(Dosen21[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int pria = 0, wanita = 0;

        for (Dosen21 dosen21 : arrayOfDosen) {
            if (dosen21.jenisKelamin) {
                totalPria += dosen21.usia;
                pria++;
            } else {
                totalWanita += dosen21.usia;
                wanita++;
            }
        }

        if (pria > 0)
            System.out.println("\nRata rata Usia Dosen Pria   : " + (totalPria / pria));

        if (wanita > 0)
            System.out.println("Rata-rata Usia Dosen Wanita : " + (totalWanita / wanita));
    }

    void infoDosenPalingTua(Dosen21[] arrayOfDosen) {
        Dosen21 tertua = arrayOfDosen[0];

        for (Dosen21 dosen21 : arrayOfDosen) {
            if (dosen21.usia > tertua.usia) {
                tertua = dosen21;
            }
        }

        System.out.println("\nDosen paling tua");
        tertua.cetakInfo();
    }

    void infoDosenPalingMuda(Dosen21[] arrayOfDosen) {
        Dosen21 termuda = arrayOfDosen[0];

        for (Dosen21 dosen21 : arrayOfDosen) {
            if (dosen21.usia < termuda.usia) {
                termuda = dosen21;
            }
        }

        System.out.println("\nDosen paling muda");
        termuda.cetakInfo();
    }
}