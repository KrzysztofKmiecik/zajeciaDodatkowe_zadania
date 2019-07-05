package Zad8Zamowienie;

public class Zamowienie {
    private Pozycja[] pozycjas;
    private int maxRozmiar;
    private int currentPozycja;

    public Zamowienie(final int maxRozmiar) {
        this.maxRozmiar = maxRozmiar;
        pozycjas = new Pozycja[this.maxRozmiar];
    }

    public Zamowienie() {
        this.maxRozmiar = 10;
        pozycjas = new Pozycja[this.maxRozmiar];
    }

    public void dodajPozycje(Pozycja pozycja) {
        pozycjas[currentPozycja] = pozycja;
        currentPozycja++;
    }

    public double obliczWartosc() {
        double wartoscZamowienia = 0.0;

        for (Pozycja poz : pozycjas) {
            wartoscZamowienia += poz.obliczWartosc();
        }

        return wartoscZamowienia;
    }

    @Override
    public String toString() {
        String str = "Zamowienie:\n";
        for (Pozycja poz : pozycjas) {
            str += String.format("%s\t%.2fzł\t%dszt.\t%.2fzł\r\n",
                    poz.getNazwaTowaru(), poz.getCenaSztuki(),
                    poz.getIloscSztuk(), poz.obliczWartosc());
        }
        return str;
    }


}
