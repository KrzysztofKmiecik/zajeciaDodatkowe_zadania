package Zad9Zajezdnia;

import lombok.Data;

@Data

public class Autobus extends Pojazd {
    private double zuzyciePaliwaWDanymMiesiącu;

    public Autobus(final int numerPojazdu, final int maxPredkosc, final double zuzyciePaliwaWDanymMiesiącu) {
        super(maxPredkosc, numerPojazdu);
        this.zuzyciePaliwaWDanymMiesiącu = zuzyciePaliwaWDanymMiesiącu;
    }

    @Override
    String getOpis() {
        return new String(String.format("Opis Autobusu: Numer pojazdu:%d, MaxPredkosc:%d, ZużyciePaliwa:%.2f ",
                this.getNumerPojazdu(),
                this.getMaxPredkosc(),
                this.zuzyciePaliwaWDanymMiesiącu));
    }
}
