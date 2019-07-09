package Ex1WeddingInvitation;

import myUtils.MyTerminal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Invitation> invitationList = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("How many invitations:");
        int numbersOfInvitations = input.nextInt();
        MyTerminal.PrintInfo("Give me your guests details");
        for (int i = 0; i < numbersOfInvitations; i++) {
            Invitation invitation = new Invitation();
            invitation.setName(input.next());
            invitation.setSurname(input.next());
            invitation.setWeddingInvitationType(WeddingEnum.valueOf(input.next()));
            invitationList.add(invitation);
        }

        System.out.println(String.format("Totally was invited: %d persons", getNumberOfInvitedPeople(invitationList)));

    }

    private static int getNumberOfInvitedPeople(List<Invitation> invitationList) {
        int numberOfInvitedPeople = 0;
        for (Invitation zaproszenie1 : invitationList) {
            numberOfInvitedPeople += zaproszenie1.getWeddingInvitationType().getHowManyPerson();
        }
        return numberOfInvitedPeople;
    }


}
/*OUTPUT
How many invitations:
2
Give me your guests details
Kate
Perry
DOUBLE
John
Rambo
SINGLE
Totally was invited: 3 persons
 */