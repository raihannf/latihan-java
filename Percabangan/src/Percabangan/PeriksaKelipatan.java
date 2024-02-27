/*
Buatlah algoritma dalam bahasa Java, menerima masukan berupa sebuah bilangan riil,
periksa apakah angka di depan koma dan angka di belakang koma adalah kelipatan 3
(angka dibelakang koma pasti 2 angka).
*/ 

package Percabangan;
import java.text.DecimalFormat;
import java.util.Scanner;

public class PeriksaKelipatan {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            DecimalFormat formatData = new DecimalFormat("#.##");

            System.out.print("Masukkan bilangan riil: ");
            float bilangan = in.nextFloat();

            int angkaDepan = (int) bilangan;
            System.out.println("Angka depan koma: " + angkaDepan);

            float angkaBelakang = (bilangan - angkaDepan) * 100;
            angkaBelakang = Float.valueOf(formatData.format(angkaBelakang));
            System.out.println("Angka belakang koma: " + (int) angkaBelakang);

            if (angkaDepan % 3 == 0 && angkaBelakang % 3 == 0) 
            {
                System.out.println("Angka di depan koma dan di belakang koma dari bilangan " + bilangan + " merupakan kelipatan 3");
            }
            else
            {
                System.out.println("Angka di depan koma dan di belakang koma dari bilangan " + bilangan + " bukan kelipatan 3");
            }
        }
    }
}
