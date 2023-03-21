package pl.javastart.task.vehicle;

public class Truck extends Car {

    private final String id = "Truck";

    private static final double WEIGHT_EXTRA_FUEL = .5;

    private static final double AIR_CON_CONSUMPTION = 1.6;
    private double loadWeigth;

    public Truck(String name, double tankCapacity, double averageFuelConsumption, boolean aiconOn, double loadWeigth) {
        super(name, tankCapacity, averageFuelConsumption, aiconOn);
        this.loadWeigth = loadWeigth;
    }

    public String getId() {
        return id;
    }

    public double getLoadWeigth() {
        return loadWeigth;
    }

    public void setLoadWeigth(double loadWeigth) {
        this.loadWeigth = loadWeigth;
    }

    @Override
    public String info() {
        return super.info() + ", Waga ładunku: " + loadWeigth;
    }

    @Override
    public double range() {
        return super.range();
    }

    private double weightFuelConsumption() {
        return (getLoadWeigth() / 100) * WEIGHT_EXTRA_FUEL;
    }

    @Override
    protected double currentFuelConsumption() {
        double consumption = getAverageFuelConsumption();
        if (isAirConOn()) {
            consumption += AIR_CON_CONSUMPTION;
        }
        return consumption += weightFuelConsumption();
    }
}
