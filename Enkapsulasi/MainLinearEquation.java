package Enkapsulasi;

import java.util.Scanner;

public class MainLinearEquation {
public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {

            LinearEquation persamaan = new LinearEquation();

            System.out.print("Masukkan nilai a: ");
            double a = in.nextDouble();

            System.out.print("Masukkan nilai b: ");
            double b = in.nextDouble();

            System.out.print("Masukkan nilai c: ");
            double c = in.nextDouble();

            System.out.print("Masukkan nilai d: ");
            double d = in.nextDouble();

            System.out.print("Masukkan nilai e: ");
            double e = in.nextDouble();

            System.out.print("Masukkan nilai f: ");
            double f = in.nextDouble();

            persamaan.setVariabel(a, b, c, d, e, f);

            if (persamaan.isSolvable(a, b, c, d) == true) {
                System.out.println("x = " + persamaan.getX());
                System.out.println("y = " + persamaan.getY());
            }
            else
            {
                System.out.println("Persamaan tidak memiliki solusi");
            }
        }
    }
}
