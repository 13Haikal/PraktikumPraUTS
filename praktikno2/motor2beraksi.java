public class Motor2Beraksi {
    public static void main(String[] args) {
        Motor2 motor = new Motor2();
        motor.warna = "Hitam";
        motor.merk = "Yamaha";
        motor.tampilkanInfo(); // print pertama

        motor.warna = "Biru";
        motor.merk = "Suzuki";
        motor.tampilkanInfo(); // print kedua
    }
}
