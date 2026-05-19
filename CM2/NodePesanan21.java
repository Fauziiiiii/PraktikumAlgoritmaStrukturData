package CM2;

public class NodePesanan21 {
    Pesanan21 data;
    NodePesanan21 prev;
    NodePesanan21 next;

    public NodePesanan21(NodePesanan21 prev, Pesanan21 data, NodePesanan21 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
