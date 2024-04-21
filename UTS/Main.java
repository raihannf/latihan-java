package UTS;

public class Main {
    public static void main(String[] args) {
        LimasSegiEmpat LimasSegiEmpat1 = new LimasSegiEmpat();

        System.out.printf(
                "Limas segi empat dengan luas alas : %.1f, luas selubung limas : %.1f dan tinggi : %.1f. Luasnya : %.2f, sedangkan volumenya : %.2f \n",
                LimasSegiEmpat1.luasAlas, LimasSegiEmpat1.luasSelubungLimas, LimasSegiEmpat1.tinggi,
                LimasSegiEmpat1.getLuas(), LimasSegiEmpat1.getVolume());

        LimasSegiEmpat LimasSegiEmpat2 = new LimasSegiEmpat();
        LimasSegiEmpat2.setLuasAlas(30);
        LimasSegiEmpat2.setSelubung(40);
        LimasSegiEmpat2.setTinggi(50);

        System.out.printf(
                "Limas segi empat dengan luas alas : %.1f, luas selubung limas : %.1f dan tinggi : %.1f. Luasnya : %.2f, sedangkan volumenya : %.2f \n",
                LimasSegiEmpat2.luasAlas, LimasSegiEmpat2.luasSelubungLimas, LimasSegiEmpat2.tinggi,
                LimasSegiEmpat2.getLuas(), LimasSegiEmpat2.getVolume());

        LimasSegiEmpat LimasSegiEmpat3 = new LimasSegiEmpat();
        LimasSegiEmpat3.setLuasAlas(25);
        LimasSegiEmpat3.setSelubung(35);
        LimasSegiEmpat3.setTinggi(45);

        System.out.printf(
                "Limas segi empat dengan luas alas : %.1f, luas selubung limas : %.1f dan tinggi : %.1f. Luasnya : %.2f, sedangkan volumenya : %.2f \n",
                LimasSegiEmpat3.luasAlas, LimasSegiEmpat3.luasSelubungLimas, LimasSegiEmpat3.tinggi,
                LimasSegiEmpat3.getLuas(), LimasSegiEmpat3.getVolume());
    }

}
