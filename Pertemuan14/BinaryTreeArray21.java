package Pertemuan14;

public class BinaryTreeArray21 {
    Mahasiswa21[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray21() {    
        this.dataMahasiswa = new Mahasiswa21[10];
    }

    void populateData(Mahasiswa21 dataMhs[], int idxLast){
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void add(Mahasiswa21 dataMhs){
        if(idxLast < dataMahasiswa.length){
            dataMahasiswa[idxLast] = dataMhs;
            idxLast++;
        }else{
            System.out.println("Data penuh");
        }
    }

    void traverseInOrder(int idxStart){
        if(idxStart <= idxLast){
            if(dataMahasiswa[idxStart] != null){
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    void traversePreOrder(int idxStart){
        if(idxStart <= idxLast){
            if(dataMahasiswa[idxStart] != null){
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 1);
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }
}
