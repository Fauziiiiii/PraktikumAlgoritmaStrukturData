package Pertemuan12;

public class SLLMain21 {
    public static void main(String[] args) {
        Mahasiswa21 mhs1 = new Mahasiswa21("123", "Fauzi", "TI-1G", 3.1);
        Mahasiswa21 mhs2 = new Mahasiswa21("124", "Bimon", "TI-1B", 3.2);
        Mahasiswa21 mhs3 = new Mahasiswa21("125", "Cintia", "TI-1V", 3.6);
        Mahasiswa21 mhs4 = new Mahasiswa21("126", "Dirga", "TI-1A", 3.5);

        SingleLinkedList21 sll = new SingleLinkedList21();

        sll.print();

        sll.addFirst(mhs4);
        sll.print();

        sll.addLast(mhs1);
        sll.print();

        sll.insertAfter("Dirga", mhs3);

        sll.insertAt(2, mhs2);

        sll.print();
    }
}
