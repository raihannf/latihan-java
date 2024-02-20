/*
Buatlah algoritma dalam bahasa Java, yang menerima inputan tiga buah masukan
bilangan bulat negatif dan menampilkan hasil operasi (+,-,*,/) ketiga bilangan!
 */
package latihandasarjava;
import java.util.Scanner;

public class OperasiBilangan {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Masukkan X: ");
        int x = myObj.nextInt();
        System.out.println("Masukkan Y: ");
        int y = myObj.nextInt();
        System.out.println("Masukkan Z: ");
        int z = myObj.nextInt();
        
        int jumlah = x + y + z;
        System.out.println("Hasil operasi penjumlahan: " + jumlah);
        
        int kurang = x - y - z;
        System.out.println("Hasil operasi pengurangan: " + kurang);
        
        int kali = x * y * z;
        System.out.println("Hasil operasi perkalian: " + kali);
        
        float bagi = (float) x / y / z;
        System.out.println("Hasil operasi pembagian: " + bagi);
    }
}
