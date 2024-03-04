/*
Buatlah algoritma dalam bahasa Java, yang menerima masukan tiga buah sisi, dimana
jika semua sisi sama maka tampilkan “Termasuk Kubus”, jika ada sisi yang tidak sama
maka tampilkan bukan kubus.
*/

package Perulangan;
import java.util.Scanner;

public class PeriksaKubus {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int[] sisi = new int[10];
            int i;
            
            for(i = 1; i <= 3; i++)
            {
                System.out.printf("Masukkan sisi ke-%d: ", i);
                sisi[i] = in.nextInt();
            }
            
            boolean isKubus = true;

            for (i = 1; i <= 2; i++) {
                if (sisi[i] != sisi[i + 1]) {
                    isKubus = false;
                    break;
                }
            }

            if (isKubus == true) {
                System.out.println("Termasuk Kubus");
            } else {
                System.out.println("Bukan Kubus");
            }
        }
    }
}
