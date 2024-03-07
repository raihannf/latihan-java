/*
Buatlah method fungsi atau prosedur dalam bahasa Java untuk menampilkan bilangan 
dari satu sampai dengan n, di mana n diinput dari alat masukan, n>=1.
*/ 

package Method;

import java.util.Scanner;

public class MethodDeretBilangan {
    static void cetakDeret(int n){
        for(int i = 1; i <= n; i++)
        {
            System.out.printf("%d ", i);
        }
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Nilai n harus >= 1!");
            int n = in.nextInt();
            
            if(n < 1)
            {
                System.out.println("Input harus lebih dari 0!");
            }
            else
            {
                cetakDeret(n);
            }
        }
    }
}
