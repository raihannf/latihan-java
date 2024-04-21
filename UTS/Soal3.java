package UTS;

import java.util.Scanner;

public class Soal3 {
    public static int sumDigits(long n) {
        int[] deretAngka = new int[100];
        int i = 0;
        int j, digit;
        int jmlDeret = 0;

        while (n != 0) {
            digit = (int) (n % 10);
            deretAngka[i] = digit;
            i++;
            n = n / 10;
        }

        for (j = 0; j <= i; j++) {
            jmlDeret = jmlDeret + deretAngka[j];
        }

        return jmlDeret;
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Masukkan bilangan bulat: ");
            long angka = in.nextLong();
            long hasil = sumDigits(angka);
            System.out.printf("Hasil penjumlahan dari tiap digit %d adalah: %d", angka, hasil);
        }
    }
}
