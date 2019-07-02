package zad1ZaproszeniaNaWesele;

enum TypZaproszenia {
    POJEDYNCZE(1),
    Z_OS_TOWARZYSZACA(2);

    final private int ileOsob;

    TypZaproszenia(final int ileOsob) {
        this.ileOsob = ileOsob;
    }

    public int getIleOsob() {
        return ileOsob;
    }
}
