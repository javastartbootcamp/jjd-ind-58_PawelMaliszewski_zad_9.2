package pl.javastart.task.vehicle;

public class Car extends Vehicle {

    private static final double AIR_CON_CONSUMPTION = .8;
    private boolean airConOn;

    public Car(String name, double tankCapacity, double averageFuelConsumption, boolean airConOn) {
        super(name, tankCapacity, averageFuelConsumption);
        this.airConOn = airConOn;
    }

    public boolean isAirConOn() {
        return airConOn;
    }

    public void setAirConOn(boolean airConOn) {
        this.airConOn = airConOn;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", " + airConStatus();
    }

    public String airConStatus() {
        if (airConOn) {
            return  "Klimatyzacja włączona";
        }
        return "Klimatyzacja wyłączona";
    }

    @Override
    public double range() {
        return super.range();
    }

    @Override
    protected double currentFuelConsumption() {
        if (isAirConOn()) {
            return getAverageFuelConsumption() + AIR_CON_CONSUMPTION;
        }
        return super.currentFuelConsumption();
    }
}
