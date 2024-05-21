package InheritanceDanPolymorphism.Nomor2;

public class Student extends Person {

    private String status;
    public static final String maba = "Mahasiswa Baru";
    public static final String tingkatDua = "Mahasiswa Tingkat Kedua";
    public static final String tingkatTiga = "Mahasiswa Tingkat Ketiga";
    public static final String tingkatAkhir = "Mahasiswa Tingkat Akhir";

    public Student(String nama, String alamat, String nomorTelepon, String email, String status) {
        super(nama, alamat, nomorTelepon, email);
        this.status = status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public String toString() {
        return super.toString() + "\nStatus: " + status;
    }
}