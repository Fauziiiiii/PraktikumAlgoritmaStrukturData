package TugasJobsheet10;

public class AntrianLayananKRS {

    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    int jumlahMahasiswa = 30;
    int sudahProses = 0;

    public AntrianLayananKRS(int max) {
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean IsEmpty(){
        if(size == 0) {
            return true;
        }else{
            return false;
        }
    }

    public boolean IsFull() {
        if(size == max){
            return true;
        }else {
            return false;
        }
    }

    public boolean AllKRSSudahProses(){
        return sudahProses == 30;
    }

    public void lihat2Terdepan() {
        if(IsEmpty()){
            System.out.println("Antrian kosong");
        }else{
            int lihat2Front = front;
            System.out.println("2 Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            for (int i = 0; i < 2; i++) {
                data[lihat2Front].tampilkanData();
                lihat2Front++;
            }
        }
    }

    public void lihatAkhir() {
        if(IsEmpty()){
            System.out.println("Antrian kosong");
        }else{
            System.out.println("Mahasiswa terakhir: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }

    public void tampilkanSemua(){
        if(IsEmpty()){
            System.out.println("Antrian kosong");
            return;
        }

        System.out.println("Daftar Mahasiswa dalam Antrian");
        System.out.println("NIM - Nama - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public int getJumlahAntrian(){
        return size;
    }

    public int getJumlahMhsSudahProses(){
        return sudahProses;
    }

    public int getJumlahMhsBelumProses(){
        return jumlahMahasiswa - sudahProses;
    }

    public void clear(){
        if(!IsEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        }else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if(IsFull()){
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa");
            return;
        }

        if(AllKRSSudahProses()){
            System.out.println("Semua mahasiswa sudah diproses KRS nya");
            return;
        }

        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian");
    }

    public void layaniMahasiswa(){
        if(IsEmpty()){
            System.out.println("Antrian masih kosong");
            return;
        }

        if(size == 1){
            System.out.println("Data antrian masih 1");
        }else{
            System.out.println("Melayani mahasiswa: ");
            for (int i = 0; i < 2; i++) {
                Mahasiswa mhs = data[front];
                front = (front + 1) % max;
                size--;
                mhs.tampilkanData();
                sudahProses++;
            }
        }
    }
}