/*
Buatlah algoritma dalam bahasa Java, Anda akan keluar membeli Mie Gacoan JIKA
mempunyai uang lebih besar dari 10.000 rupiah dan pasangan Anda sedang tidak ada
kelas kuliah (dapat ditulis sebagai ekspresi -> (uang > 10000) &&
(!tidakAdaKelasKuliah))
 */
package latihandasarjava;
import java.util.Scanner;

public class GacoanDate {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Masukkan jumlah uang: ");
        int uang = myObj.nextInt();
        System.out.println("Apakah ayang bubub ada kelas? ");
        boolean adaKelasKuliah = myObj.nextBoolean();

        if ((uang > 10000) && (!adaKelasKuliah))
        {
            System.out.println("Gas berangkat bub!");
        }
        else
        {
            System.out.println("Yaah... Lain kali aja bub...");
        }
    }
}
