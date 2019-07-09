package Ex5Citizen;

public abstract class Citizen {

    private String name;

    public Citizen(final String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    abstract boolean canVote();

}
