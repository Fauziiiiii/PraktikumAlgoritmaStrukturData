package jobsheet9;

public class StackSurat21 {
    Surat21[] stack;
    int size;
    int top;

    StackSurat21(int size) {
        this.size = size;
        stack = new Surat21[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        }else{
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }else{
            return false;
        }
    }

    public void push(Surat21 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        }else{
            System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi.");
        }
    }

    public Surat21 pop() {
        if(!isEmpty()){
            Surat21 m = stack[top];
            top--;
            return m;
        }else{
            System.out.println("Stack kosong! Tidak ada surat untuk dinilai.");
            return null;
        }
    }

    public Surat21 peek() {
        if(!isEmpty()){
            return stack[top];
        }else{
            System.out.println("Stack kosong! Tidak ada surat yang dikumpulkan");
            return null;
        }
    }

    public Surat21 searchSuratByNamaMhs(String namaMhs){
        if(!isEmpty()){
            for (int i = 0; i <= top; i++) {
                if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMhs)) {
                    System.out.println("Ditemukan surat dengan nama mahasiswa: " + namaMhs);
                    return stack[i];
                }
            }
            System.out.println("Tidak ada surat dengan nama mahasiswa: " + namaMhs);
            return null;
        } else{
            System.out.println("Stack kosong! Tidak ada surat yang dikumpulkan");
            return null;
        }
    }
}
