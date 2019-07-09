package Ex9Depot;

import lombok.Data;

@Data

public class Bus extends Vehicle {
    private double fuelConsumptionPerMonth;

    public Bus(final int vehicleNumber, final int maxVelocity, final double fuelConsumptionPerMonth) {
        super(maxVelocity, vehicleNumber);
        this.fuelConsumptionPerMonth = fuelConsumptionPerMonth;
    }

    @Override
    String getDescription() {
        return new String(String.format("Bus description: VehicleNumber:%d, MaxVelocity:%d, FuelConsumption:%.2f ",
                this.getVehiculeNumber(),
                this.getMacVelocity(),
                this.fuelConsumptionPerMonth));
    }
}
