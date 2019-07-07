package Zad9Zajezdnia;

public class Tramwaj extends Pojazd {
    private IleWagonow ileWagonow;

    public Tramwaj(final int numerPojazdu, final int maxPredkosc, final IleWagonow ileWagonow) {
        super(maxPredkosc, numerPojazdu);
        this.ileWagonow = ileWagonow;
    }

    @Override
    String getOpis() {
        return new String(String.format("Opis Autobusu: Numer pojazdu:%d, MaxPredkosc:%d ,IlośćWagonów %s",
                this.getNumerPojazdu(),
                this.getMaxPredkosc(),
                this.ileWagonow));
    }
}
