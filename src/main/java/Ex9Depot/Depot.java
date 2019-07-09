package Ex9Depot;

public abstract class Depot {

    public Depot(final String depotName) {
        this.depotName = depotName;
    }

    public String getDepotName() {
        return depotName;
    }

    public void setDepotName(final String depotName) {
        this.depotName = depotName;
    }

    private String depotName;

    abstract void getDescription();
}
