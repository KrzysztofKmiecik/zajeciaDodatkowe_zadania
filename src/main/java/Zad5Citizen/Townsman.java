package Zad5Citizen;

public class Townsman extends Citizen {
    public Townsman(final String imie) {
        super(imie);
    }

    @Override
    boolean canVote() {
        return true;
    }
}
