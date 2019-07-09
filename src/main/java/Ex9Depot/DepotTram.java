package Ex9Depot;

import java.util.ArrayList;
import java.util.List;

public class DepotTram extends Depot {
    private List<Tram> trams;

    public DepotTram(final String depotName) {
        super(depotName);
        trams = new ArrayList<>();
    }

    public void addVehicle(Tram tram) {
        this.trams.add(tram);
    }

    @Override
    void getDescription() {
        System.out.println(String.format("Tram depot %s:",
                this.getDepotName()));
        trams.stream().forEach(c -> System.out.println(c.getDescription()));
    }
}
