package CM2Kuis;

public class DLLPesanan21 {
    NodePesanan21 head;
    NodePesanan21 tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(Pesanan21 data) {
        NodePesanan21 newNode = new NodePesanan21(null, data, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void bubbleSort() {
        boolean swap;
        
        if (isEmpty() || head.next == null) {
            return;
        }

        do {
            swap = false;
            NodePesanan21 current = head;
            
            while (current.next != null) {
                String nama1 = current.data.namaPesanan.toLowerCase();
                String nama2 = current.next.data.namaPesanan.toLowerCase();
                if (nama1.compareTo(nama2) > 0) {
                    Pesanan21 temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swap = true;
                }
                current = current.next;
            }
        } while(swap);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan");
            return;
        }

        bubbleSort();
        int totalPendapatan = 0;

        System.out.println("==========================================================================");
        System.out.printf("%-10s %-20s %-15s %-20s\n",
                "Kode",
                "Nama Pesanan",
                "Harga",
                "Pembeli");
        System.out.println("==========================================================================");

        NodePesanan21 current = head;
        while (current != null) {
            current.data.tampilPesanan();
            totalPendapatan += current.data.harga;
            current = current.next;
        }
        System.out.println("\nTotal Pendapatan : Rp " + totalPendapatan);
    }
}
