package Zad9Zajezdnia;

public abstract class Zajezdnia {

    public Zajezdnia(final String nazwaZajezdni) {
        this.nazwaZajezdni = nazwaZajezdni;
    }

    public String getNazwaZajezdni() {
        return nazwaZajezdni;
    }

    public void setNazwaZajezdni(final String nazwaZajezdni) {
        this.nazwaZajezdni = nazwaZajezdni;
    }

    private String nazwaZajezdni;

    abstract void getOpis();
}
