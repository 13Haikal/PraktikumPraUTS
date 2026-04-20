public class Sks {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNama("Budi");
        mhs.setSks(24);
        mhs.tampilkanInfo(); // print pertama

        mhs.setSks(30);
        mhs.tampilkanInfo(); // print kedua
    }
}