import java.util.Scanner;

public class SiakadFor28 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int lulus= 0;
        int tidakLulus= 0;
        
        for (int i = 1; i <= 10; i++) {

            System.out.println("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            
            if (nilai >= 60) {
                System.out.println(" Mahassiwa lulus");
                lulus += 1;
            }
            else {
                System.out.println("Mahasiswa tidak lulus");
                tidakLulus += 1;
            }
        }

        System.out.println("Nilai tertinggi " + tertinggi);
        System.out.println("Nilai terendah " + terendah);
        System.out.println("Mahasiswa yang lulus "+lulus);
        System.out.println("Mahasiswa yang Tidak lulus "+tidakLulus);

        sc.close();
    }
}