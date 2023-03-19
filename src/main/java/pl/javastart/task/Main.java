package pl.javastart.task;

import pl.javastart.task.vehicle.VehicleUtils;

public class Main {

    public static void main(String[] args) {
        VehicleUtils vehicleUtils = new VehicleUtils();
        vehicleUtils.createVehicles();
        vehicleUtils.showAllVehicleInfo();
        System.out.println("---------------------------------------------------");
        vehicleUtils.swithOnAirConAllVehicles();
        vehicleUtils.showAllVehicleInfo();

        System.out.println("---------------------------------------------------");

        vehicleUtils.getCarsInfo();

        System.out.println("---------------------------------------------------");

        vehicleUtils.getTrucksInfo();
    }
}
