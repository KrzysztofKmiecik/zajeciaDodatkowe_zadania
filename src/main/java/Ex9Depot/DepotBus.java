package Ex9Depot;

import java.util.ArrayList;
import java.util.List;


public class DepotBus extends Depot {
    private List<Bus> autobus;


    public DepotBus(final String depotName) {
        super(depotName);
        autobus = new ArrayList<>();
    }


    public void addVehicle(Bus autobus) {
        this.autobus.add(autobus);
    }

    @Override
    void getDescription() {
        System.out.println(String.format("Bus Depot %s :",
                this.getDepotName()));
        autobus.stream().forEach(c -> System.out.println(c.getDescription()));


    }
}
