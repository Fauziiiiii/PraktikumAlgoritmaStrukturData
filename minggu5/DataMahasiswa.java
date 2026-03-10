package minggu5;

public class DataMahasiswa {
    public int maxUTSDC(Mahasiswa[] arr, int l, int r) {
        if (l == r) {
            return arr[l].uts;
        }

        int mid = (l + r) / 2;
        int leftMax = maxUTSDC(arr, l, mid);
        int rightMax = maxUTSDC(arr, mid + 1, r);

        return Math.max(leftMax, rightMax);
    }

    public int minUTSDC(Mahasiswa[] arr, int l, int r) {
        if (l == r) {
            return arr[l].uts;
        }

        int mid = (l + r) / 2;
        int leftMin = minUTSDC(arr, l, mid);
        int rightMin = minUTSDC(arr, mid + 1, r);

        return Math.min(leftMin, rightMin);
    }

    public double rataUASBF(Mahasiswa[] arr) {
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i].uas;
        }

        return (double) total / arr.length;
    }

    public void tampilkanMahasiswaUTSTertinggi(Mahasiswa[] arr, int maxNilai) {
        System.out.println("Mahasiswa dengan nilai UTS tertinggi (" + maxNilai + "):");
        boolean ada = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].uts == maxNilai) {
                arr[i].tampilData();
                System.out.println("-------------------------");
                ada = true;
            }
        }

        if (!ada) {
            System.out.println("Tidak ada data.");
        }
    }

    public void tampilkanMahasiswaUTSTerendah(Mahasiswa[] arr, int minNilai) {
        System.out.println("Mahasiswa dengan nilai UTS terendah (" + minNilai + "):");
        boolean ada = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].uts == minNilai) {
                arr[i].tampilData();
                System.out.println("-------------------------");
                ada = true;
            }
        }

        if (!ada) {
            System.out.println("Tidak ada data.");
        }
    }
}
