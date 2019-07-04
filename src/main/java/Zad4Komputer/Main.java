package Zad4Komputer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Komputer komputer1 = new Komputer(10, "Intel", TypProcesora.WIELORDZENIOWY);
        Komputer komputer2 = new Komputer(20, "AMD", TypProcesora.JEDNORDZENIOWY);
        Laptop laptop1 = new Laptop(30, "Intel", TypProcesora.WIELORDZENIOWY, 15.6, true);
        Laptop laptop2 = new Laptop(40, "AMD", TypProcesora.JEDNORDZENIOWY, 14, false);
        List<Komputer> myKomputerList = new ArrayList<>();
        myKomputerList.add(komputer1);
        myKomputerList.add(komputer2);
        myKomputerList.add(laptop1);
        myKomputerList.add(laptop2);

        for (Komputer komp : myKomputerList) {
            System.out.print(komp);
            if (komp instanceof Laptop) {
                System.out.print(String.format("Wielkosc matrycy=%.1f",((Laptop) komp).getWielkoscMatrycy()));
            }
            System.out.println();
        }
    }
}
