package Enkapsulasi;

public class LinearEquation {
    private double a, b, c, d, e, f;

    // constructor tanpa argumen untuk menginisialisasi objek
    public LinearEquation() {
    }

    // method yang digunakan untuk memasukkan nilai ke dalam atribut yang dibuat private
    public void setVariabel(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    // enam method get untuk a, b, c, d, e, dan f
    public double getA()
    {
        return a;
    }

    public double getB()
    {
        return b;
    }

    public double getC()
    {
        return c;
    }

    public double getD()
    {
        return d;
    }

    public double getE()
    {
        return e;
    }

    public double getF()
    {
        return f;
    }

    // method untuk memeriksa apakah persamaan linear memiliki solusi atau tidak
    public boolean isSolvable(double a, double b, double c, double d)
    {
        if (a * d - b * c != 0) 
        {
            return true;
        }
        else{
            return false;
        }
    }

    // method untuk menghitung solusi x dari persamaan
    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    // method untuk menghitung solusi y dari persamaan
    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }
}
