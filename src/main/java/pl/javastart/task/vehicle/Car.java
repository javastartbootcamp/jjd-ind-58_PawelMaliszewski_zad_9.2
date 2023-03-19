package pl.javastart.task.vehicle;

public class Car extends Vehicle {

    private final String id = "Car";
    private static final double AIR_CON_CONSUMPTION = .8;

    protected static final double BY_100_KM = 100;

    private boolean airConOn;

    public Car(String name, double tankCapacity, double averageFuelConsumption, boolean airConOn) {
        super(name, tankCapacity, averageFuelConsumption);
        this.airConOn = airConOn;
    }

    public String getId() {
        return id;
    }

    public boolean isAirConOn() {
        return airConOn;
    }

    public void setAirConOn(boolean airConOn) {
        this.airConOn = airConOn;
    }

    @Override
    public String info() {
        return super.info() + airConSatus();
    }

    public String airConSatus() {
        if (airConOn) {
            return  ", Klimatyzacja włączona";
        }
        return ", Klimatyzacja wyłączona";
    }

    @Override
    public double range() {
        return tankDividedByFuelConsumption() * BY_100_KM;
    }

    protected double getCurrentFuelConsumption() {
        if (isAirConOn()) {
            return getAverageFuelConsumption() + AIR_CON_CONSUMPTION;
        }
        return getAverageFuelConsumption();
    }

    protected double tankDividedByFuelConsumption() {
        return getTankCapacity() / getCurrentFuelConsumption();
    }
}
