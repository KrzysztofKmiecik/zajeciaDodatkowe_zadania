package Zad4Komputer;

public class Laptop extends Komputer {
    private double wielkoscMatrycy;
    private boolean retine;


    public Laptop(final int moc, final String producent, final TypProcesora procesora, final double wielkoscMatrycy, final boolean retine) {
        super(moc, producent, procesora);
        this.wielkoscMatrycy = wielkoscMatrycy;
        this.retine = retine;
    }

    public double getWielkoscMatrycy() {
        return wielkoscMatrycy;
    }

    public boolean isRetine() {
        return retine;
    }
}
