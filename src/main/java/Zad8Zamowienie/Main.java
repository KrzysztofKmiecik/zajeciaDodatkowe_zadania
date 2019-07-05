package Zad8Zamowienie;

public class Main {
    public static void main(String[] args) {

        Zamowienie zamowienie1=new Zamowienie(2);
        zamowienie1.dodajPozycje(new Pozycja("Chleb",2,2.00));
        zamowienie1.dodajPozycje(new Pozycja("Banany",1,6.00));
        System.out.println(zamowienie1.toString());
        System.out.println(String.format("Razem= %.2f zł", zamowienie1.obliczWartosc()));
    }
}
