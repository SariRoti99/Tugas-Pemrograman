import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        
        // Input golongan dan jam lembur 
        System.out.print("Masukkan Golongan Karyawan (A/B/C): "); 
        String golongan = input.next().toUpperCase();
        
        System.out.print("Masukkan Jumlah Jam Lembur: "); 
        int jamLembur = input.nextInt();

        double gajiPokok = 0; 
        double persenLembur = 0;
        double gajiLembur, totalGaji;

        // Menentukan gaji pokok berdasarkan golongan 
        if (golongan.equals("A")) {
            gajiPokok = 5000000;
        } else if (golongan.equals("B")) { 
            gajiPokok = 6500000;
        } else if (golongan.equals("C")) { 
            gajiPokok = 9500000;
        } else {
            System.out.println("Golongan tidak dikenal!"); 
            System.exit(0);
        }
        
        // Menentukan persentase lembur berdasarkan jam lembur 
        if (jamLembur == 1) {
            persenLembur = 0.30;
        } else if (jamLembur == 2) { 
            persenLembur = 0.32;
        } else if (jamLembur == 3) { 
            persenLembur = 0.34;
        } else if (jamLembur == 4) { 
            persenLembur = 0.36;
        } else if (jamLembur >= 5) { 
            persenLembur = 0.38;
        } else {
            persenLembur = 0; // tidak lembur
        }

        // Menghitung gaji lembur dan total gaji 
        gajiLembur = gajiPokok * persenLembur; 
        totalGaji = gajiPokok + gajiLembur;
         
        // Menampilkan hasil
        System.out.println("\n=== HASIL PERHITUNGAN GAJI ==="); 
        System.out.println("Golongan Karyawan : " + golongan); 
        System.out.println("Gaji Pokok        : Rp " + String.format("%,.0f", gajiPokok)); 
        System.out.println("Gaji Lembur       : Rp " + String.format("%,.0f", gajiLembur)); 
        System.out.println("Total Penghasilan : Rp " + String.format("%,.0f", totalGaji));
        input.close();
    }
}