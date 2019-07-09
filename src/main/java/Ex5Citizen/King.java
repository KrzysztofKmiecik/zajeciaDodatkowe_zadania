package Ex5Citizen;

public class King extends Citizen {
    public King(final String name) {
        super(name);
    }

    @Override
    boolean canVote() {
        return false;
    }
}
