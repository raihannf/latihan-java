package UTS;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {

            int[] angka = new int[100];
            int i = 0, positif = 0, negatif = 0, totalAngka = 0;
            float total = 0, rerata = 0;

            System.out.println("Masukkan Angka:");

            // Input angka ke dalam array
            for (i = 0; i < angka.length; i++) {
                angka[i] = in.nextInt();
                if (angka[i] == 0) {
                    break; // Keluar dari loop jika input adalah 0
                }
                totalAngka++; // Menghitung total angka yang dimasukkan ke dalam array
            }

            // Menghitung jumlah bilangan positif, negatif, dan total
            for (i = 0; i < totalAngka; i++) {
                if (angka[i] >= 0) {
                    positif++;
                } else {
                    negatif++;
                }
                total += angka[i];
            }

            // Menghitung nilai rata-rata
            rerata = total / totalAngka;

            // Menampilkan hasil
            System.out.println("Jumlah bilangan positif: " + positif);
            System.out.println("Jumlah bilangan negatif: " + negatif);
            System.out.println("Nilai total: " + total);
            System.out.printf("Nilai rata-rata: %.2f", rerata);
        }
    }
}
