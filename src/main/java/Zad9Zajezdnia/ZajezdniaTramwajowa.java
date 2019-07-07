package Zad9Zajezdnia;

import java.util.ArrayList;
import java.util.List;

public class ZajezdniaTramwajowa extends Zajezdnia {
    private List<Tramwaj> tramwaj;

    public ZajezdniaTramwajowa(final String nazwaZajezdni) {
        super(nazwaZajezdni);
        tramwaj = new ArrayList<>();
    }

    public void dodajPojazd(Tramwaj tramwaj) {
        this.tramwaj.add(tramwaj);
    }

    @Override
    void getOpis() {
        System.out.println(String.format("Zajezdnia Tramwajowa o nazwie %s",
                this.getNazwaZajezdni()));
        tramwaj.stream().forEach(c -> System.out.println(c.getOpis()));
    }
}
