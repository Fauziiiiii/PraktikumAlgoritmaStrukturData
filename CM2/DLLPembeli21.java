package CM2;

public class DLLPembeli21 {
    NodePembeli21 head;
    NodePembeli21 tail;

    public boolean isEmpty() {
        return head == null;
    }
    
    public void addLast(Pembeli21 data) {
        NodePembeli21 newNode = new NodePembeli21(null, data, null);
        if (isEmpty()) {
            head = tail = newNode;
        }else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Pembeli masuk ke antrian");
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return;
        }
        
        System.out.println("========================================================");
        System.out.printf("%-10s %-20s %-15s\n",
                "Antrian", "Nama", "No HP");
        System.out.println("========================================================");
        
        NodePembeli21 current = head;
        while (current != null) {
            current.data.tampilPembeli();
            current = current.next;
        }
    }

    public Pembeli21 removeFirst() {
        Pembeli21 dataHapus = head.data;

        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        return dataHapus;
    }
}
