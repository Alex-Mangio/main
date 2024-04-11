package estoilette;

public class Main {
    public static void main(String[] args) {
        Bagno b = new Bagno();

        ThreadFemmine tm1 = new ThreadFemmine("maschio", false, b);
        ThreadFemmine tm2 = new ThreadFemmine("maschio", false, b);
        ThreadFemmine tf1 = new ThreadFemmine("femmina", true, b);
        ThreadFemmine tf2 = new ThreadFemmine("femmina", true, b);

        tf1.start();
        tm2.start();
        tf2.start();
        tm1.start();
    }
}