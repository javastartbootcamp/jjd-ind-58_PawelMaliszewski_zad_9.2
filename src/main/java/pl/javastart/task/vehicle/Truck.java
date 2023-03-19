package pl.javastart.task.vehicle;

public class Truck extends Car {

    private final String id = "Truck";

    private static final double BY_100_KM = 100;
    private static final double WEIGHT_EXTRA_FUEL = .5;

    private final double airConConsumption = 1.6;
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
        if (isAiconOn() && loadWeigth == 0) {
            return rangeWithAirConOn() * BY_100_KM;
        } else if (!isAiconOn() && loadWeigth == 0) {
            return rangeWithAirConOff() * BY_100_KM;
        } else if (isAiconOn() && loadWeigth > 0) {
            return  rangeWithAirConOnAndLoad() * BY_100_KM;
        }
        return rangeWithAirConOffAndLoad() * BY_100_KM;
    }

    public double rangeWithAirConOnAndLoad() {
        return getTankCapacity() / (getAverageFuelConsumption()
                + airConConsumption + (loadWeigth / 100 * WEIGHT_EXTRA_FUEL));
    }

    public double rangeWithAirConOffAndLoad() {
        return getTankCapacity() / (getAverageFuelConsumption() + (loadWeigth / 100 * WEIGHT_EXTRA_FUEL));
    }
}
