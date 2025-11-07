import java.util.Scanner;

public class SiakadFor11{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // inisialisasi variabel
        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidakLulus = 0; // variabel untuk menghitung jumlah
        
        // input nilai 10 mahasiswa
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            
            // cek nilai tertinggi
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            
            // cek nilai terendah
            if (nilai < terendah) {
                terendah = nilai;
            }

            // hitung lulus dan tidak lulus
            if (nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }

        // tampilkan hasil
        System.out.println("\n=== HASIL AKHIR ===");
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah  : " + terendah);
        System.out.println("Jumlah mahasiswa lulus     : " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus : " + tidakLulus);
    }
}

