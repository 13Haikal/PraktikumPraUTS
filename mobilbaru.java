public class MobilBaru {
    String merk;
    String warna;

    MobilBaru(String w, String m) {
        warna = w;
        merk = m;
    }

    void tampilkanInfo() {
        System.out.println("Warna: " + warna);
        System.out.println("Merk: " + merk);
    }
}