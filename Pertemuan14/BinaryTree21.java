package Pertemuan14;

public class BinaryTree21 {
    Node21 root;
    int length;
    int counter = 0;

    public BinaryTree21(){
        root = null;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void add(Mahasiswa21 mahasiswa){
        Node21 newNode = new Node21(mahasiswa);
        if(isEmpty()){
            root = newNode;
        }else{
            Node21 current = root;
            Node21 parent = null;
            while (true) {
                parent = current;
                if(mahasiswa.ipk < current.mahasiswa.ipk){
                    current = current.left;
                    if(current == null){
                        parent.left = newNode;
                        length++;
                        return;
                    }
                }else{
                    current = current.right;
                    if(current == null){
                        parent.right = newNode;
                        length++;
                        return;
                    }
                }
            }
        }
    }

    public void addRekursif(Mahasiswa21 mahasiswa) {
        root = addRekursif(root, mahasiswa);
    }

    public Node21 addRekursif(Node21 current, Mahasiswa21 mahasiswa) {

        if (current == null) {
            return new Node21(mahasiswa);
        }

        if (mahasiswa.ipk < current.mahasiswa.ipk) {
            current.left = addRekursif(current.left, mahasiswa);
        } else {
            current.right = addRekursif(current.right, mahasiswa);
        }

        return current;
    }

    // public Node21 addRekursif(Node21 current, Mahasiswa21 mahasiswa) {

    //     if (current == null) {
    //         return new Node21(mahasiswa);
    //     }

    //     if (mahasiswa.nama.compareTo(current.mahasiswa.nama) > 0) {
    //         current.right = addRekursif(current.right, mahasiswa);
    //     } else {
    //         current.left = addRekursif(current.left, mahasiswa);
    //     }

    //     return current;
    // }

    boolean find(double ipk){
        boolean result = false;
        Node21 current = root;
        while(current != null){
            if(current.mahasiswa.ipk == ipk){
                result = true;
                break;
            }else if(ipk > current.mahasiswa.ipk){
                current = current.right;
            }else{
                current = current.left;
            }
        }

        return result;
    }

    Node21 findByNamaMhs(Node21 node, String namaMhs){
        Node21 result = null;
        // Node21 current = root;

        while(node != null){
            if(node.mahasiswa.nama.compareTo(namaMhs) == 0){
                result = node;
                break;
            }else if(node.mahasiswa.nama.compareTo(namaMhs) > 0){
                node = node.right;
            }else{
                node = node.left;
            }
        }
        
        // while(current != null){
        //     if(current.mahasiswa.nama.equalsIgnoreCase(namaMhs)){
        //         result = current;
        //         System.out.println("Proses true ditemukan");
        //         break;
        //     }else{
        //         current = current.right;
        //         System.out.println("proses else");
        //     }
        // }

        return result;
    }

    // void findMahasiswaByKelas(String kelasInput){
    //     Node21 current = root;
    //     if(current != null){
    //         if(current.mahasiswa.ipk >= ipkInput){
    //             current.mahasiswa.tampilInformasi();
    //         }
    //         tampilMahasiswaIPKdiAtas(current.left, ipkInput);
    //         tampilMahasiswaIPKdiAtas(current.right, ipkInput);
    //     }
    // }

    void cariMinIPK() {
        if(isEmpty()){
            System.out.println("Nullll");
        }

        Node21 current = root;

        while(current.left != null){
            current = current.left;
        }

        System.out.println("\nMin IPK:");
        current.mahasiswa.tampilInformasi();
    }

    void cariMaxIPK() {
        if(isEmpty()){
            System.out.println("Nullll");
        }

        Node21 current = root;

        while(current.right != null){
            current = current.right;
        }

        System.out.println("\nMax IPK:");
        current.mahasiswa.tampilInformasi();
    }

    void tampilMahasiswaIPKdiAtas(Node21 node, double ipkInput){
        if(node != null){
            if(node.mahasiswa.ipk >= ipkInput){
                node.mahasiswa.tampilInformasi();
            }
            tampilMahasiswaIPKdiAtas(node.left, ipkInput);
            tampilMahasiswaIPKdiAtas(node.right, ipkInput);
        }
    }

    void find3MahasiswaIPKTertinggi(Node21 node){
        if(node != null){
            find3MahasiswaIPKTertinggi(node.left);
            find3MahasiswaIPKTertinggi(node.right);
            if(counter <= length && counter >= 7){
                node.mahasiswa.tampilInformasi();
            }
            counter++;
        }
    }

    void findMahasiswaByNama(Node21 node, String nama){
        if(node != null){
            findMahasiswaByNama(node.left, nama);
            findMahasiswaByNama(node.right, nama);
            if(node.mahasiswa.nama.equalsIgnoreCase(nama)){
                node.mahasiswa.tampilInformasi();
            }
        }
    }

    void findMahasiswaByKelas(Node21 node, String kelas){
        if(node != null){
            if(node.mahasiswa.kelas.equalsIgnoreCase(kelas)){
                node.mahasiswa.tampilInformasi();
            }
            findMahasiswaByKelas(node.left, kelas);
            findMahasiswaByKelas(node.right, kelas);
        }
    }
    
    void traversePreOrder(Node21 node){
        if(node != null){
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node21 node){
        if(node != null){
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(Node21 node){
        if(node != null){
            traverseInOrder(node.left);
            traverseInOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node21 getSuccessor(Node21 del){
        Node21 successor = del.right;
        Node21 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if(successor != del.right){
            successorParent.left = successor.right;
            successor.right = del.right;
        }

        return successor;
    }

    void delete(double ipk){
        if(isEmpty()){
            System.out.println("Binary tree kosong");
            return;
        }

        Node21 parent = root;
        Node21 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if(current.mahasiswa.ipk == ipk){
                break;
            }else if(ipk < current.mahasiswa.ipk){
                parent = current;
                current = current.left;
                isLeftChild = true;
            }else if(ipk > current.mahasiswa.ipk){
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        if(current == null){
            System.out.println("Data tidak ditemukan");
            return;
        }else{
            if(current.left == null && current.right == null){
                if(current == root){
                    root = null;
                }else{
                    if(isLeftChild){
                        parent.left = null;
                    }else{
                        parent.right = null;
                    }
                }
            }else if(current.left == null){
                if(current == root){
                    root = current.right;
                }else{
                    if(isLeftChild){
                        parent.left = current.right;
                    }else{
                        parent.right = current.right;
                    }
                }
            }else if(current.right == null){
                if(current == root){
                    root = current.left;
                }else{
                    if(isLeftChild){
                        parent.left = current.left;
                    }else{
                        parent.right = current.left;
                    }
                }
            }else{
                Node21 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();
                if(current == root){
                    root = successor;
                }else{
                    if(isLeftChild){
                        parent.left = successor;
                    }else{
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

}
