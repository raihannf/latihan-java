/*
Buatlah algoritma dalam bahasa Java, menampilkan bilangan dari satu sampai dengan
n, dimana n diinput dari alat masukan, n>=1.
*/

package Perulangan;
import java.util.Scanner;

public class DeretBilangan {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Masukkan nilai n: ");
            int n = in.nextInt();
            
            if(n < 1)
            {
                System.out.println("Input harus lebih dari 0!");
            }
            else
            {
                for(int i = 1; i <= n; i++)
                {
                    System.out.printf("%d ", i);
                }
            }
        }
    }
}
