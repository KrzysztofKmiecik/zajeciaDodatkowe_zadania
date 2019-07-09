package Ex5Citizen;

public class Townsman extends Citizen {
    public Townsman(final String name) {
        super(name);
    }

    @Override
    boolean canVote() {
        return true;
    }
}
