package Zad9Zajezdnia;

public class Main {
    public static void main(String[] args) {
        Autobus autobus1 = new Autobus(1111, 10, 14);
        Autobus autobus2 = new Autobus(2222, 20, 24);
        Autobus autobus3 = new Autobus(3333, 30, 34);

        Tramwaj tramwaj1 = new Tramwaj(11, 10, IleWagonow.jeden);
        Tramwaj tramwaj2 = new Tramwaj(22, 20, IleWagonow.dwa);
        Tramwaj tramwaj3 = new Tramwaj(33, 30, IleWagonow.trzy);

        ZajezdniaAutobusowa zajezdniaAutobusowa = new ZajezdniaAutobusowa("GdyniaObłuże");
        zajezdniaAutobusowa.dodajPojazd(autobus1);
        zajezdniaAutobusowa.dodajPojazd(autobus2);
        zajezdniaAutobusowa.dodajPojazd(autobus3);

        ZajezdniaTramwajowa zajezdniaTramwajowa = new ZajezdniaTramwajowa("GdyniaChylonia");
        zajezdniaTramwajowa.dodajPojazd(tramwaj1);
        zajezdniaTramwajowa.dodajPojazd(tramwaj2);
        zajezdniaTramwajowa.dodajPojazd(tramwaj3);

        zajezdniaAutobusowa.getOpis();
        zajezdniaTramwajowa.getOpis();
    }
}
