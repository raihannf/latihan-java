package ObjekdanKelas;

public class Main {
    public static void main(String[] args) {
        Segitiga segitiga1 = new Segitiga();
        System.out.println("Luas dari segitiga 1 adalah: " + segitiga1.getLuas());
        System.out.println("Keliling dari segitiga 1 adalah: " + segitiga1.getKeliling() + "\n");

        Segitiga segitiga2 = new Segitiga();
        segitiga2.alas = 30;
        segitiga2.tinggi = 10;
        segitiga2.sisi = 90;
        System.out.println("Luas dari segitiga 1 adalah: " + segitiga2.getLuas());
        System.out.println("Keliling dari segitiga 1 adalah: " + segitiga2.getKeliling() + "\n");

        Segitiga segitiga3 = new Segitiga();
        segitiga3.setAlas(20);
        segitiga3.setTinggi(30);
        segitiga3.setSisi(60);
        System.out.println("Luas dari segitiga 1 adalah: " + segitiga3.getLuas());
        System.out.println("Keliling dari segitiga 1 adalah: " + segitiga3.getKeliling() + "\n");
    }
}
