package Pertemuan12.Tugas;

public class SingleLinkedList21 {
    Node21 front;
    Node21 rear;
    int size;
    int max;

    public SingleLinkedList21(int max) {
        this.max = max;
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Mahasiswa21 data) {
        if (isFull()) {
            System.out.println("Antrian penuh");
            return;
        }

        Node21 baru = new Node21(data);

        if (isEmpty()) {
            front = rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }

        size++;
        System.out.println("Mahasiswa masuk antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        System.out.print("Memanggil: ");
        front.data.tampilInformasi();

        front = front.next;
        size--;

        if (front == null) {
            rear = null;
        }
    }

    public void peekFront() {
        if (!isEmpty()) {
            System.out.print("Antrian terdepan: ");
            front.data.tampilInformasi();
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.print("Antrian terakhir: ");
            rear.data.tampilInformasi();
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        Node21 temp = front;
        System.out.println("\nIsi Antrian:");
        while (temp != null) {
            temp.data.tampilInformasi();
            temp = temp.next;
        }
    }

    public void jumlah() {
        System.out.println("Jumlah antrian: " + size);
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

}
