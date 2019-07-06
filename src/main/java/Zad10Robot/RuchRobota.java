package Zad10Robot;

public enum RuchRobota {
    KROK_LEWA(10),
    KROK_PRAWA(10),
    RUCH_REKA_LEWA(5),
    RUCH_REKA_PRAWA(5),
    SKOK(20);

    private int kosztBateri;


    RuchRobota(final int kosztBateri) {
        this.kosztBateri = kosztBateri;
    }

    public int getKosztBateri() {
        return kosztBateri;
    }
}
