package pl.javastart.task.vehicle;

public class Truck extends Car {

    private static final double WEIGHT_EXTRA_FUEL = .5;
    private static final double AIR_CON_CONSUMPTION = 1.6;
    private double loadWeight;

    public Truck(String name, double tankCapacity, double averageFuelConsumption, boolean aiconOn, double loadWeight) {
        super(name, tankCapacity, averageFuelConsumption, aiconOn);
        this.loadWeight = loadWeight;
    }

    public double getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(double loadWeigth) {
        this.loadWeight = loadWeigth;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Waga ładunku: " + loadWeight;
    }

    @Override
    public double range() {
        return super.range();
    }

    private double weightFuelConsumption() {
        return (getLoadWeight() / 100) * WEIGHT_EXTRA_FUEL;
    }

    @Override
    protected double currentFuelConsumption() {
        double consumption = getAverageFuelConsumption();
        if (isAirConOn()) {
            consumption += AIR_CON_CONSUMPTION;
        }
        return consumption + weightFuelConsumption();
    }
}
