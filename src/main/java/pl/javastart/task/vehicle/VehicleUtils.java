package pl.javastart.task.vehicle;

public class VehicleUtils {

    private static final int MAX_VEHICLES = 8;
    private final Vehicle[] vehicles = new Vehicle[MAX_VEHICLES];

    public void createVehicles() {
        vehicles[0] = new Car("Polonez", 60, 9.35, false);
        vehicles[1] = new Car("Maluch", 35, 6.5, false);
        vehicles[2] = new Car("Syrenka", 50, 8.1, false);
        vehicles[3] = new Car("Warszawa", 70, 13.5, false);
        vehicles[4] = new Truck("Star", 250, 16.6, false, 0);
        vehicles[5] = new Truck("Volvo", 300, 15.5, false, 1000);
        vehicles[6] = new Truck("Tatra", 200, 19.5, false, 5500);
        vehicles[7] = new Truck("Mercedes", 250, 14.5, false, 6000);
    }

    public void showAllVehicleInfo() {
        for (Vehicle vehicle : vehicles) {
            System.out.printf(vehicle.info() + ", Zasięg: %.0f%s\n", vehicle.range(), "km");
        }
    }

    public void showSpecificCarInfo(String name) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId() == name) {
                System.out.printf(vehicle.info() + ", Zasięg: %.0f%s\n", vehicle.range(), "km");
            }
        }
    }

    public void swithOnAirConAllVehicles() {
        for (Vehicle vehicle : vehicles) {
            vehicle.setAiconOn(true);
        }
    }

    public void getCarsInfo() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId() == "Car") {
                System.out.printf(vehicle.info() + ", Zasięg: %.0f%s\n", vehicle.range(), "km");
            }
        }
    }

    public void getTrucksInfo() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId() == "Truck") {
                System.out.printf(vehicle.info() + ", Zasięg: %.0f%s\n", vehicle.range(), "km");
            }
        }
    }
}

