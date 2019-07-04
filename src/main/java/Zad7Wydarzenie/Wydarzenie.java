package Zad7Wydarzenie;

import Zad6MojaData.MojaData;

public class Wydarzenie {
    private String nazwa;
    private MojaData mojaData;


    public Wydarzenie(final String nazwa, final MojaData mojaData) {
        this.nazwa = nazwa;
        this.mojaData = mojaData;
    }

    public int ileZostaloLat(MojaData mojaDataObecna) {
        return ileZostaloMiesiecy(mojaDataObecna) / 12;

    }

    public int ileZostaloMiesiecy(MojaData mojaDataObecna) {

        return ileZostloDni(mojaDataObecna) / 30;
    }


    public int ileZostloDni(MojaData mojaDataObecna) {
        return diffrenceInDays(mojaDataObecna);
    }

    private int ileDniWMiesiacu(int rok, int miesiac) {
        int[] ileDni = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (MojaData.przestepny(rok)) {
            ileDni[1] = 29;
        }
        return ileDni[miesiac - 1];
    }

    private int diffrenceInDays(MojaData myCurrentDate) {
        int y2 = this.mojaData.getYear();
        int m2 = this.mojaData.getMonth();
        int d2 = this.mojaData.getDay();
        int y1 = myCurrentDate.getYear();
        int m1 = myCurrentDate.getMonth();
        int d1 = myCurrentDate.getDay();

        int ileDni = 0;
        int ileDniWMiesiacu = 0;

        if (y1 == y2) {
            if (m1 == m2) {
                ileDni = d2 - d1;
            } else {
                for (int i = m1; i < m2; i++) {
                    ileDniWMiesiacu = ileDniWMiesiacu(y1, i);
                    if (i == m1) {
                        ileDni = ileDni + ileDniWMiesiacu - d1 + d2;
                    } else {
                        ileDni += ileDniWMiesiacu;
                    }
                }
            }
        } else {

            for (int i = m1; i <= 12; i++) {
                if (i == m1) {
                    ileDni = ileDni + ileDniWMiesiacu(y1, i) - d1;
                } else {
                    ileDni += ileDniWMiesiacu(y1, i);
                }
            }
            for (int i = m2; i >= 1; i--) {
                if (i == m2) {
                    ileDni = ileDni + d2;
                } else {
                    ileDni += ileDniWMiesiacu(y2, i);
                }
            }

            if (y2 - y1 > 1) {
                for (int i = y1 + 1; i < y2; i++) {
                    if (MojaData.przestepny(i)) {
                        ileDni += 366;
                    } else {
                        ileDni += 365;

                    }

                }
            }

        }
        return ileDni;


    }

}
