package pl.javastart.task.vehicle;

public class Vehicle {
    protected static final double BY_100_KM = 100;
    private String name;
    private double tankCapacity;
    private double averageFuelConsumption;

    public Vehicle(String name, double tankCapacity, double averageFuelConsumption) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.averageFuelConsumption = averageFuelConsumption;
    }

    public String getId() {
        return "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getAverageFuelConsumption() {
        return averageFuelConsumption;
    }

    public void setAverageFuelConsumption(double averageFuelConsumption) {
        this.averageFuelConsumption = averageFuelConsumption;
    }

    public String info() {
        return "Nazwa: " + name + ", Pojemność baku: " + tankCapacity
                + ", Spalanie na 100km: " + currentFuelConsumption() + " Litra";
    }

    public double range() {
        return tankCapacity / currentFuelConsumption() * BY_100_KM;
    }

    protected double currentFuelConsumption() {
        return averageFuelConsumption;
    }
}
