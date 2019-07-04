package Zad5Citizen;

public abstract class Citizen {

    private String imie;

    public Citizen(final String imie) {
        this.imie = imie;
    }
    public String getImie() {
        return imie;
    }

    abstract boolean canVote();

}
