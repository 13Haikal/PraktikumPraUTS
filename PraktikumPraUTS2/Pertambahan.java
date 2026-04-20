public class Pertambahan {
    
    // Method untuk pertambahan 2 angka int
    static int tambah(int a, int b) {
        return a + b;
    }
    
    // Method untuk pertambahan 2 angka double
    static double tambah(double a, double b) {
        return a + b;
    }
    
    // Method untuk pertambahan 3 angka int
    static int tambah(int a, int b, int c) {
        return a + b + c;
    }
    
    public static void main(String[] args) {
        System.out.println("Pertambahan 2 angka (int): " + tambah(3, 5));
        System.out.println("Pertambahan 2 angka (double): " + tambah(3.3, 5.5));
        System.out.println("Pertambahan 3 angka (int): " + tambah(1, 2, 3));
    }
}