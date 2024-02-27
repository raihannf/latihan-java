/*
Buatlah algoritma dalam bahasa Java, berupa menu yang dapat memasukan pilihan jika
menginputkan karakter operator aritmatika ‘+’ akan melakukan penjumlahan, jika ‘-‘
pengurangan sampai karakter ‘*’, ‘/’ dan ‘%’ dua bilangan integer.
Contoh Masukan
Masukan bilangan pertama : 3
Masukan bilangan kedua : 2
Masukan operator aritmatika : +
Contoh Keluaran
Hasil penjumlahan 3 dan 2 adalah : 5
*/

package Percabangan;
import java.util.Scanner;

public class InputOperasiBilangan {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Masukkan X: ");
            int x = in.nextInt();

            System.out.print("Masukkan Y: ");
            int y = in.nextInt();

            System.out.print("Masukkan operator (+, -, *, /, atau %): ");
            char operasi = in.next().charAt(0);

            switch (operasi) {
                case '+':
                    int jumlah = x + y;
                    System.out.printf("Hasil penjumlahan %d dan %d adalah %d", x, y, jumlah);
                    break;
                case '-':
                    int kurang = x - y;
                    System.out.printf("Hasil pengurangan %d dan %d adalah %d", x, y, kurang);
                    break;
                case '*':
                    int kali = x * y;
                    System.out.printf("Hasil perkalian %d dan %d adalah %d", x, y, kali);
                    break;
                case '/':
                    int bagi = x / y;
                    System.out.printf("Hasil pembagian %d dan %d adalah %d", x, y, bagi);
                    break;
                case '%':
                    int mod = x % y;
                    System.out.printf("Hasil dari %d mod %d adalah %d", x, y, mod);
                    break;
            
                default:
                    System.out.println("Input salah!");
                    break;
            }
        }
    }
}
