package Zad9Zajezdnia;

import java.util.ArrayList;
import java.util.List;


public class ZajezdniaAutobusowa extends Zajezdnia {
    private List<Autobus> autobus;


    public ZajezdniaAutobusowa(final String nazwaZajezdni) {
        super(nazwaZajezdni);
        autobus = new ArrayList<>();
    }


    public void dodajPojazd(Autobus autobus) {
        this.autobus.add(autobus);
    }

    @Override
    void getOpis() {
        System.out.println(String.format("Zajezdnia Autobusowa o nazwie %s",
                this.getNazwaZajezdni()));
        autobus.stream().forEach(c -> System.out.println(c.getOpis()));


    }
}
