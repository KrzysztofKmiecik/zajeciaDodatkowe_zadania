package Ex9Depot;

public class Tram extends Vehicle {
    private TramWagons tramWagons;

    public Tram(final int vehicleNumber, final int maxVelocity, final TramWagons tramWagons) {
        super(maxVelocity, vehicleNumber);
        this.tramWagons = tramWagons;
    }

    @Override
    String getDescription() {
        return new String(String.format("Tram description: Vehicle number:%d, MaxVelocity:%d ,TramWagons %s",
                this.getVehiculeNumber(),
                this.getMacVelocity(),
                this.tramWagons));
    }
}
