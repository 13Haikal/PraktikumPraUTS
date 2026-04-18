public class HewanPolimor {
    public static void main(String[] args) {
        Hewan h1 = new Hewan();
        Hewan h2 = new Herbivora();
        Hewan h3 = new Karnivora();
        Hewan h4 = new Kelinci();

        h1.bersuara();
        h2.bersuara();
        h3.bersuara();
        h4.bersuara();
    }
}