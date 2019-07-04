package Zad5Citizen;

public class Soldier extends Citizen {
    public Soldier(final String imie) {
        super(imie);
    }

    @Override
    boolean canVote() {
        return true;
    }
}
