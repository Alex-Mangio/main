package trhead;

public class Main {
    public static void main(String[] args) {
        Bagno bagno = new Bagno(1);
        Persona p1 = new Persona("Marco",bagno);
        Persona p2 = new Persona("Matteo",bagno);

        p1.start();
        p2.start();

    }
}