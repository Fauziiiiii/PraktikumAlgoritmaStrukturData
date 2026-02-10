package jobsheet1;

import java.util.Scanner;

public class PraktikumPerulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nim, n;
        // int n;

        System.out.print("Masukkan NIM anda: ");
        nim = sc.nextDouble();
        n = nim % 100;

        if(n < 10){
            n += 10;
        }

        for(int i = 1; i <= n; i++) {
            if(i == 10 || i == 15){
                
            }else if(i % 3 == 0){
                System.out.print("# ");
            }else if(i % 2 != 0){
                System.out.print("* ");
            }else{
                System.out.print(i + " ");
            }
        }
    }
}
