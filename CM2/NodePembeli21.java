package CM2;

public class NodePembeli21 {
    Pembeli21 data;
    NodePembeli21 prev;
    NodePembeli21 next;

    public NodePembeli21(NodePembeli21 prev, Pembeli21 data, NodePembeli21 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}