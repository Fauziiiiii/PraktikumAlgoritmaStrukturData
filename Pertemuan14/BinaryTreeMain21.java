package Pertemuan14;

import java.util.Scanner;

public class BinaryTreeMain21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree21 bst = new BinaryTree21();

        // bst.addRekursif(new Mahasiswa21("244160121", "Ali", "A", 3.57));
        // bst.addRekursif(new Mahasiswa21("244160221", "Badar", "B", 3.85));
        // bst.addRekursif(new Mahasiswa21("244160220", "Dewi", "B", 3.54));
        // bst.addRekursif(new Mahasiswa21("244160185", "Candra", "C", 3.21));

        // System.out.println("\nDaftar semua mahasiswa (in order traversal) :");
        // bst.traverseInOrder(bst.root);
        
        // System.out.println("\nPencarian data mahasiswa");
        // System.out.print("Cari mahasiswa dengan ipk: 3.54 : ");
        // String hasilCari = bst.find(3.54)?"Ditemukan":"Tidak ditemukan";
        // System.out.println(hasilCari);
        
        // System.out.print("Cari mahasiswa dengan ipk: 3.22 : ");
        // hasilCari = bst.find(3.22)?"Ditemukan":"Tidak ditemukan";
        // System.out.println(hasilCari);
        
        // bst.addRekursif(new Mahasiswa21("244160131", "Devi", "A", 3.72));
        // bst.addRekursif(new Mahasiswa21("244160205", "Ehsan", "D", 3.37));
        // bst.addRekursif(new Mahasiswa21("244160170", "Fizi", "B", 3.46));
        
        // System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa: ");
        // System.out.println("InOrder Traversal: ");
        // bst.traverseInOrder(bst.root);
        
        // System.out.println("\nPrePrder Traversal: ");
        // bst.traversePreOrder(bst.root);
        
        // System.out.println("\nPostOrder Traversal: ");
        // bst.traversePostOrder(bst.root);
        
        // System.out.println("\nPenghapusan data mahasiswa");
        // bst.delete(3.57);
        // System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal): ");
        // bst.traverseInOrder(bst.root);
        
        // bst.cariMinIPK();
        // bst.cariMaxIPK();
        
        // System.out.print("\nTampil mahasiswa dengan ipk diatas: ");
        // double ipkInput = sc.nextDouble();
        // bst.tampilMahasiswaIPKdiAtas(bst.root, ipkInput);


        bst.add(new Mahasiswa21("220101001", "Andi", "TI-1A", 3.95));
        bst.add(new Mahasiswa21("220101002", "Budi", "TI-1A", 3.20));
        bst.add(new Mahasiswa21("220101003", "Sinta", "TI-1B", 3.82));
        bst.add(new Mahasiswa21("220101004", "Rina", "TI-1B", 3.45));
        bst.add(new Mahasiswa21("220101005", "Dimas", "TI-1C", 2.75));
        bst.add(new Mahasiswa21("220101006", "Fajar", "TI-1C", 3.10));
        bst.add(new Mahasiswa21("220101007", "Nabila", "TI-1D", 3.76));
        bst.add(new Mahasiswa21("220101008", "Rizky", "TI-1D", 3.50));
        bst.add(new Mahasiswa21("220101009", "Aulia", "TI-1E", 3.88));
        bst.add(new Mahasiswa21("220101010", "Kevin", "TI-1E", 3.00));
        
        System.out.println("\nDaftar semua mahasiswa (in order traversal) :");
        bst.traversePostOrder(bst.root);

        System.out.print("\nCari mahasiswa berdasarkan nama: ");
        String inputNama = sc.nextLine();
        Node21 hasilCari = bst.findByNamaMhs(bst.root, inputNama);
        System.out.println(hasilCari);
        if(hasilCari != null){
            System.out.println("Ditemukan data mahasiswa dengan nama " + inputNama + ":");
            hasilCari.mahasiswa.tampilInformasi();
        }

        System.out.println("\nHasil 3 IPK tertinggi");
        bst.find3MahasiswaIPKTertinggi(bst.root);

        System.out.print("\nCari Mahasiswa berdasarkan kelas: ");
        String inputKelas = sc.nextLine();
        bst.findMahasiswaByKelas(bst.root, inputKelas);

        System.out.print("\nCari Mahasiswa berdasarkan nama: ");
        String namaINput = sc.nextLine();
        bst.findMahasiswaByKelas(bst.root, namaINput);
        
    }
}
