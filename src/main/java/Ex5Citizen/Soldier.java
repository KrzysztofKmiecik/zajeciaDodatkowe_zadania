package Ex5Citizen;

public class Soldier extends Citizen {
    public Soldier(final String name) {
        super(name);
    }

    @Override
    boolean canVote() {
        return true;
    }
}
