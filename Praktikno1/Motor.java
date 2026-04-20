public class Motor {
    String merk;
    String warna;
    int tahun;
    static int jumlahMotor = 0;

    public Motor(String merk) {
        this.merk = merk;
        jumlahMotor++;
    }
}
