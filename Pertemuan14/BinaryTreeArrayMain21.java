package Pertemuan14;

public class BinaryTreeArrayMain21 {
    public static void main(String[] args) {
        BinaryTreeArray21 bta = new BinaryTreeArray21();
        bta.add(new Mahasiswa21("244160121", "Ali", "A", 3.57));
        bta.add(new Mahasiswa21("244160121", "Ali2", "A", 3.58));
        bta.add(new Mahasiswa21("244160121", "Ali3", "A", 3.59));
        bta.add(new Mahasiswa21("244160121", "Ali4", "A", 3.67));
        System.out.println("Data In Order");
        bta.traverseInOrder(0);

        System.out.println("\nData Pre Order");
        bta.traversePreOrder(0);
    }
}
