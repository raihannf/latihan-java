package InheritanceDanPolymorphism.Nomor2;

public class Staff extends Employee {

    private String pangkat;

    public Staff(String nama, String alamat, String nomorTelepon, String email, int kantor, double gaji,
            String pangkat) {
        super(nama, alamat, nomorTelepon, email, kantor, gaji);
        this.pangkat = pangkat;
    }

    public String getpangkat() {
        return pangkat;
    }

    public void setpangkat(String pangkat) {
        this.pangkat = pangkat;
    }

    public String toString() {
        return super.toString() + "\nPangkat: " + pangkat;
    }
}