package zad1ZaproszeniaNaWesele;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Zaproszenie> invitationList = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj ilosc zaproszen:");
        int numbersOfInvitations = input.nextInt();

        for (int i = 0; i < numbersOfInvitations; i++) {
            Zaproszenie zaproszenie = new Zaproszenie();
            zaproszenie.setImie(input.next());
            zaproszenie.setNazwisko(input.next());
            zaproszenie.setTypZaproszenia(TypZaproszenia.valueOf(input.next()));
            invitationList.add(zaproszenie);
        }

        getNumberOfInvitedPeople(invitationList);
    }

    private static void getNumberOfInvitedPeople(List<Zaproszenie> invitationList) {
        int numberOfInvitedPeople = 0;
        for (Zaproszenie zaproszenie1 : invitationList) {
            numberOfInvitedPeople += zaproszenie1.getTypZaproszenia().getIleOsob();
        }
        System.out.println(String.format("Lacznie zaproszono: %d osob", numberOfInvitedPeople));


    }
}
