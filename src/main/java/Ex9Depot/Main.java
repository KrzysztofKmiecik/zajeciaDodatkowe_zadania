package Ex9Depot;

public class Main {
    public static void main(String[] args) {
        Bus autobus1 = new Bus(1111, 10, 14);
        Bus autobus2 = new Bus(2222, 20, 24);
        Bus autobus3 = new Bus(3333, 30, 34);

        Tram tramwaj1 = new Tram(11, 10, TramWagons.one);
        Tram tramwaj2 = new Tram(22, 20, TramWagons.two);
        Tram tramwaj3 = new Tram(33, 30, TramWagons.three);

        DepotBus depotBus = new DepotBus("GdyniaObłuże");
        depotBus.addVehicle(autobus1);
        depotBus.addVehicle(autobus2);
        depotBus.addVehicle(autobus3);

        DepotTram depotTram = new DepotTram("GdyniaChylonia");
        depotTram.addVehicle(tramwaj1);
        depotTram.addVehicle(tramwaj2);
        depotTram.addVehicle(tramwaj3);

        depotBus.getDescription();
        depotTram.getDescription();
    }
}
/*OUTPUT
Bus Depot GdyniaObłuże :
Bus description: VehicleNumber:1111, MaxVelocity:10, FuelConsumption:14,00
Bus description: VehicleNumber:2222, MaxVelocity:20, FuelConsumption:24,00
Bus description: VehicleNumber:3333, MaxVelocity:30, FuelConsumption:34,00
Tram depot GdyniaChylonia:
Tram description: Vehicle number:11, MaxVelocity:10 ,TramWagons one
Tram description: Vehicle number:22, MaxVelocity:20 ,TramWagons two
Tram description: Vehicle number:33, MaxVelocity:30 ,TramWagons three

Process finished with exit code 0
 */