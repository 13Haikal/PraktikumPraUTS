public class SepedaBeraksi {
    public static void main(String[] args) {
        Sepeda s = new Sepeda();
        s.merk = "Polygon";
        s.kecepatan = 20;
        s.tampilkanInfo(); // print pertama

        s.kecepatan = 30;
        s.tampilkanInfo(); // print kedua
    }
}
