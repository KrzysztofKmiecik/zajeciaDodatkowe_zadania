package Zad5Citizen;

public class King extends Citizen {
    public King(final String imie) {
        super(imie);
    }

    @Override
    boolean canVote() {
        return false;
    }
}
