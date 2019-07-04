package Zad7Wydarzenie;

import Zad6MojaData.MojaData;

public class Main {
    public static void main(String[] args) {
        MojaData teraz = new MojaData(25, 2, 2019);
        Wydarzenie wydarzenie = new Wydarzenie("Opener", new MojaData(6, 04, 2020));

        System.out.println(String.format("Zostalo w latach: %s", wydarzenie.ileZostaloLat(teraz)));
        System.out.println(String.format("Zostalo w miesiącach: %s", wydarzenie.ileZostaloMiesiecy(teraz)));
        System.out.println(String.format("Zostalo w dniach: %s", wydarzenie.ileZostloDni(teraz)));
    }
}
