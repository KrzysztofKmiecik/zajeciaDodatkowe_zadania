package zad1ZaproszeniaNaWesele;

import myUtils.MyTerminal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Zaproszenie> invitationList = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj ilosc zaproszen:");
        int numbersOfInvitations = input.nextInt();
        MyTerminal.PrintInfo("podaj gosci");
        for (int i = 0; i < numbersOfInvitations; i++) {
            Zaproszenie zaproszenie = new Zaproszenie();
            zaproszenie.setImie(input.next());
            zaproszenie.setNazwisko(input.next());
            zaproszenie.setTypZaproszenia(TypZaproszenia.valueOf(input.next()));
            invitationList.add(zaproszenie);
        }

        System.out.println(String.format("Lacznie zaproszono: %d osob", getNumberOfInvitedPeople(invitationList)));

    }

    private static int getNumberOfInvitedPeople(List<Zaproszenie> invitationList) {
        int numberOfInvitedPeople = 0;
        for (Zaproszenie zaproszenie1 : invitationList) {
            numberOfInvitedPeople += zaproszenie1.getTypZaproszenia().getIleOsob();
        }
        return numberOfInvitedPeople;
    }


}
