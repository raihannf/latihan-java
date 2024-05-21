package InheritanceDanPolymorphism.Nomor2;

public class Person {

    private String nama;
    private String alamat;
    private String nomorTelepon;
    private String email;

    public Person() {
        this("Tidak terisi", "Tidak terisi", "Tidak terisi", "Tidak terisi");
    }

    public Person(String nama, String alamat, String nomorTelepon, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public String getEmail() {
        return email;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "\nNama: " + nama + "\nAlamat: " + alamat + "\nNomor Telepon: " + nomorTelepon
                + "\nAlamat Email: " + email;
    }
}