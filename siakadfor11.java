package dasprojobsheet7;

import java.util.Scanner;

public class siakadfor11 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
         //inisialisasi tertinggi//
         double nilai, tertinggi = 0, terendah = 11;
         for ( int i = 1; i <= 10; i++){
            System.out.println(" masukkan nilai mahsiswa ke-"+i+":");
            nilai = sc.nextDouble();
            if (nilai > tertinggi ) {
                tertinggi = nilai ;
            }
            if (nilai < terendah) {
                terendah = nilai ;
            }
            // nilai tertinggi dan terendah //
            System.out.println(" nilai tertinggi+ tertinggi");
            System.out.println(" nilai terendah"+ terendah );
            
    }
}
}
