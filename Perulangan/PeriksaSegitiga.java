/*
Buatlah algoritma dalam bahasa Java, yang membaca panjang (integer) tiga buah sisi
sebuah segitiga, a, b, dan c, yang dalam hal ini a <= b <= c, lalu menentukan apakah
ketiga sisi tersebut membentuk segitiga siku – siku, segitiga lancip, atau segitiga
tumpul (gunakan hukum Phytagoras).
*/

package Perulangan;

import java.util.Scanner;
import java.lang.Math;

public class PeriksaSegitiga {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int[] sisi = new int[10];
            
            for(int i = 1; i <= 3; i++)
            {
                if (i == 1) {
                    System.out.printf("Masukkan sisi a: ");
                    sisi[i] = in.nextInt();
                }
                else if (i == 2) {
                    System.out.printf("Masukkan sisi b: ");
                    sisi[i] = in.nextInt();
                }
                else if (i == 3) {
                    System.out.printf("Masukkan sisi c: ");
                    sisi[i] = in.nextInt();
                }
            }

            int a = (int) Math.pow(sisi[1], 2);
            int b = (int) Math.pow(sisi[2], 2);
            int c = (int) Math.pow(sisi[3], 2);

            if (c > (a + b)) {
                System.out.println("Segitiga tumpul");
            }
            else if (c < (a + b)) {
                System.out.println("Segitiga lancip");
            }
            else if (c == (a + b)) {
                System.out.println("Segitiga siku-siku");
            }
        }
    }
}
