package InheritanceDanPolymorphism.Nomor1;

import java.util.Scanner;

public class PengujianSegitiga {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            Segitiga segitiga = new Segitiga();

            System.out.print("Masukkan nilai sisi1: ");
            double side1 = in.nextDouble();
            segitiga.setSide1(side1);

            System.out.print("Masukkan nilai sisi2: ");
            double side2 = in.nextDouble();
            segitiga.setSide2(side2);

            System.out.print("Masukkan nilai sisi3: ");
            double side3 = in.nextDouble();
            segitiga.setSide3(side3);

            in.nextLine();

            System.out.print("Masukkan warna segitiga: ");
            String color = in.nextLine();
            segitiga.setColor(color);

            System.out.print("Apakah segitiga terisi (filled)? (true/false): ");
            boolean filled = in.nextBoolean();
            segitiga.setFilled(filled);

            System.out.println("Segitiga: " + segitiga.toString());
            System.out.println("Luas: " + segitiga.getArea());
            System.out.println("Keliling: " + segitiga.getPerimeter());
            System.out.println("Warna: " + segitiga.getColor());
            System.out.println("Filled: " + segitiga.isFilled());
        }

    }
}