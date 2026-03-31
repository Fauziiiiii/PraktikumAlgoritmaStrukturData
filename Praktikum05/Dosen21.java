package Praktikum05;

public class Dosen21 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    Dosen21(){
    }

    Dosen21(String kd, String name, boolean jk, int age){
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil(){
        System.out.println("Kode\t\t: " + kode);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Jenis Kelamin\t: " + (jenisKelamin ? "L" : "P"));
        System.out.println("Usia\t\t: " + usia);
    }
}
