package Zad5Citizen;

public class Peasant extends Citizen {
    public Peasant(final String imie) {
        super(imie);
    }

    @Override
    boolean canVote() {
        return false;
    }
}
