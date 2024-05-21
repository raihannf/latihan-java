package InheritanceDanPolymorphism.Nomor2;

public class Faculty extends Employee {

    private String jamKerja;
    private String pangkat;

    public Faculty(String nama, String alamat, String nomorTelepon, String email,
            int kantor, double gaji, String jamKerja, String pangkat) {
        super(nama, alamat, nomorTelepon, email, kantor, gaji);
        this.jamKerja = jamKerja;
        this.pangkat = pangkat;
    }

    public String getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(String jamKerja) {
        this.jamKerja = jamKerja;
    }

    public String getPangkat() {
        return pangkat;
    }

    public void setPangkat(String pangkat) {
        this.pangkat = pangkat;
    }

    public String toString() {
        return super.toString() + "\nJam Kerja: " + jamKerja + "\nPangkat: " + pangkat;
    }
}