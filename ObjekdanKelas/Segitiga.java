package ObjekdanKelas;

public class Segitiga {
    double alas = 1;
    double tinggi = 1;
    double sisi = 1;

    double getLuas()
    {
        return 0.5 * alas * tinggi;
    }

    double getKeliling()
    {
        return 3 * sisi;
    }

    void setAlas(double alasBaru)
    {
        alas = alasBaru;
    }

    void setTinggi(double tinggiBaru)
    {
        tinggi = tinggiBaru;
    }

    void setSisi(double sisiBaru)
    {
        sisi = sisiBaru;
    }
}
