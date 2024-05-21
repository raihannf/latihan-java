package InheritanceDanPolymorphism.Nomor2;

import java.util.GregorianCalendar;

public class MyDate {

    private int tahun;
    private int bulan;
    private int hari;

    MyDate() {
        GregorianCalendar kalender = new GregorianCalendar();
        tahun = kalender.get(GregorianCalendar.YEAR);
        bulan = kalender.get(GregorianCalendar.MONTH);
        hari = kalender.get(GregorianCalendar.DAY_OF_MONTH);
    }

    MyDate(int tahun, int bulan, int hari) {
        this.tahun = tahun;
        this.bulan = bulan;
        this.hari = hari;
    }

    public int getTahun() {
        return tahun;
    }

    public String getBulan() {
        String m = String.valueOf(bulan + 1);
        return (bulan < 10 ? "0" + m : m);
    }

    public String getHari() {
        String d = String.valueOf(hari);
        return (hari < 10 ? "0" + d : d);
    }

    public void setDate() {
        GregorianCalendar kalender = new GregorianCalendar();
        tahun = kalender.get(GregorianCalendar.YEAR);
        bulan = kalender.get(GregorianCalendar.MONTH);
        hari = kalender.get(GregorianCalendar.DAY_OF_MONTH);
    }
}