package CM1;

import java.util.Scanner;

public class DataPeminjaman21 {
    Mahasiswa21[] listMhs = {
            new Mahasiswa21("22001", "Andi", "TI"),
            new Mahasiswa21("22002", "Budi", "TI"),
            new Mahasiswa21("22003", "Citra", "SIB")
    };

    Buku21[] listBuku = {
            new Buku21("B001", "Algoritma", "2020"),
            new Buku21("B002", "Basis Data", "2019"),
            new Buku21("B003", "Pemrograman", "2021"),
            new Buku21("B004", "Fisika", "2024")
    };

    Peminjaman21[] listPeminjaman = {
            new Peminjaman21(listMhs[0], listBuku[0], 7),
            new Peminjaman21(listMhs[1], listBuku[1], 3),
            new Peminjaman21(listMhs[2], listBuku[2], 10),
            new Peminjaman21(listMhs[2], listBuku[3], 6),
            new Peminjaman21(listMhs[0], listBuku[1], 4)
    };

    void tampilSemuaMahasiswa() {
        System.out.println("\nData Mahasiswa:\n");
        for (int i = 0; i < listMhs.length; i++) {
            listMhs[i].tampilMahasiswa();
            System.out.println("----------------------------");
        }
    }

    void tampilSemuaBuku() {
        System.out.println("\nData Buku:\n");
        for (int i = 0; i < listBuku.length; i++) {
            listBuku[i].tampilBuku();
            System.out.println("----------------------------");
        }
    }

    void tampilSemuaPeminjaman() {
        System.out.println("\nData Peminjaman:\n");
        for (int i = 0; i < listPeminjaman.length; i++) {
            listPeminjaman[i].tampilPeminjaman();
            System.out.println("----------------------------");
        }
    }

    void sortPeminjamanByDenda() {
        for (int i = 1; i < listPeminjaman.length; i++) {
            Peminjaman21 temp = listPeminjaman[i];
            int j = i;

            while (j > 0 && listPeminjaman[j - 1].denda < temp.denda) {
                listPeminjaman[j] = listPeminjaman[j - 1];
                j--;
            }
            listPeminjaman[j] = temp;
        }
    }

    void sortPeminjamanByNIM() {
        for (int i = 1; i < listPeminjaman.length; i++) {
            Peminjaman21 temp = listPeminjaman[i];
            int j = i;

            while (j > 0 && Integer.parseInt(listPeminjaman[j - 1].mhs.nim) > Integer.parseInt(temp.mhs.nim)) {
                listPeminjaman[j] = listPeminjaman[j - 1];
                j--;
            }
            listPeminjaman[j] = temp;
        }
    }

    void inputMenu5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan NIM yang akan dicari: ");
        String inputNIM = sc.nextLine();

        searchPeminjamanByNIM(inputNIM);

    }

    void searchPeminjamanByNIM(String cariNIM) {
        int left = 0;
        int right = listPeminjaman.length - 1;
        boolean ditemukan = false;

        do {
            int mid = (left + right) / 2;

            int midNIM = Integer.parseInt(listPeminjaman[mid].mhs.nim);
            int cari = Integer.parseInt(cariNIM);

            if (midNIM == cari) {
                System.out.println("Data ditemukan:\n");
                listPeminjaman[mid].tampilPeminjaman();
                ditemukan = true;

            } 

            if (midNIM > cari) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }while (left <= right);

        if (!ditemukan) {
            System.out.println("Data tidak ditemukan!");
        }
    }

}
