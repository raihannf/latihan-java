package InheritanceDanPolymorphism.Nomor2;

public class Employee extends Person {

    private int kantor;
    private double gaji;
    private MyDate tglDiterima;

    public Employee(String nama, String alamat, String nomorTelepon, String email, int kantor, double gaji) {
        super(nama, alamat, nomorTelepon, email);
        this.kantor = kantor;
        this.gaji = gaji;
        this.tglDiterima = new MyDate();
    }

    public int getKantor() {
        return kantor;
    }

    public String getGaji() {
        return String.format("%.2f", gaji);
    }

    public String getTglDiterima() {
        return tglDiterima.getHari() + "/" + tglDiterima.getBulan() + "/" + tglDiterima.getTahun();
    }

    public void setKantor(int kantor) {
        this.kantor = kantor;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void setTglDiterima() {
        tglDiterima = new MyDate();
    }

    public String toString() {
        return super.toString() + "\nRuang Kantor: " + kantor + "\nGaji: Rp" + getGaji() + "\nTanggal Diterima: "
                + getTglDiterima();
    }
}