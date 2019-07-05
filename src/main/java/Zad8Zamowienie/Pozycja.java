package Zad8Zamowienie;

public class Pozycja {

    private String nazwaTowaru;
    private int iloscSztuk;
    private double cenaSztuki;

    public Pozycja(final String nazwaTowaru, final int iloscSztuk, final double cenaSztuki) {
        this.nazwaTowaru = nazwaTowaru;
        this.iloscSztuk = iloscSztuk;
        this.cenaSztuki = cenaSztuki;
    }

    public double obliczWartosc() {
        return getCenaSztuki()*getIloscSztuk();
    }

    public String getNazwaTowaru() {
        return nazwaTowaru;
    }

    public int getIloscSztuk() {
        return iloscSztuk;
    }

    public double getCenaSztuki() {
        return cenaSztuki;
    }

    @Override
    public String toString() {
        return "Pozycja{" +
                "nazwaTowaru='" + nazwaTowaru + '\'' +
                ", iloscSztuk=" + iloscSztuk +
                ", cenaSztuki=" + cenaSztuki +
                '}';
    }
}
