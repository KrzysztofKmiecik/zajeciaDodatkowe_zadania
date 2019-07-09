package Ex5Citizen;

public class Peasant extends Citizen {
    public Peasant(final String name) {
        super(name);
    }

    @Override
    boolean canVote() {
        return false;
    }
}
