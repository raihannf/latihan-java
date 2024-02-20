/*
Buatlah algoritma dalam bahasa Java, menjumlahkan kode ASCII dari karakter ‘4’ dan
karakter ‘6’!
 */
package latihandasarjava;

public class MenjumlahkanASCII {
    public static void main(String args[]) {
        char x = '4';
        char y = '6';
        
        int jumlahASCII = x + y;
        System.out.println("Hasil penjumlahan kode ASCII dari " + x + " dan " + y + " adalah: " + jumlahASCII);
    }
}
