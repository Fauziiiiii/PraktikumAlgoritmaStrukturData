package Praktikum05;

public class DataDosen21 {
    Dosen21[] dataDosen = new Dosen21[10];
    int idx;

    void tambah(Dosen21 d){
        if(idx < dataDosen.length){
            dataDosen[idx] = d;
            idx++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }

    void tampil(){
        if(cekDataKosong()){
            System.out.println("\nData Dosen:");
            for(int i = 0; i < idx; i++){
                dataDosen[i].tampil();
                System.out.println("-------------------------------");
            }
        }
    }

    void SortingASC(){
        if(cekDataKosong()){
            for (int i = 0; i < idx - 1; i++) {
                for (int j = 1; j < idx - i; j++) {
                    if(dataDosen[j].usia < dataDosen[j-1].usia){
                        Dosen21 tmp = dataDosen[j];
                        dataDosen[j] = dataDosen[j-1];
                        dataDosen[j-1] = tmp;
                    }
                }
            }
            System.out.println("\nData berhasil diurutkan ASC");
        }
    }

    void SortingDSC(){
        if(cekDataKosong()){
            for (int i = 1; i < idx; i++) {
                Dosen21 temp = dataDosen[i];
                int j = i;
    
                while(j > 0 && dataDosen[j-1].usia < temp.usia){
                    dataDosen[j] = dataDosen[j-1];
                    j--;
                }
                dataDosen[j] = temp;
            }
            System.out.println("\nData berhasil diurutkan DSC");
        }
    }

    boolean cekDataKosong(){
        if(idx == 0){
            System.out.println("\nData dosen masih kosong");
            return false;
        }
        return true;
    }
}
