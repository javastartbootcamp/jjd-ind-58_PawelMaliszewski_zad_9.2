package pl.javastart.task.vehicle;

public class Car extends Vehicle {

    private final String id = "Car";
    private final double airConConsumption = .8;

    private boolean aiconOn;

    public Car(String name, double tankCapacity, double averageFuelConsumption, boolean aiconOn) {
        super(name, tankCapacity, averageFuelConsumption);
        this.aiconOn = aiconOn;
    }

    public String getId() {
        return id;
    }

    public boolean isAiconOn() {
        return aiconOn;
    }

    public void setAiconOn(boolean aiconOn) {
        this.aiconOn = aiconOn;
    }

    @Override
    public String info() {
        return super.info() + airConSatus();
    }

    public String airConSatus() {
        if (aiconOn) {
            return  ", Klimatyzacja włączona";
        }
        return ", Klimatyzacja wyłączona";
    }

    @Override
    public double range() {
        if (aiconOn) {
            return rangeWithAirConOn() * 100;
        }
        return rangeWithAirConOff() * 100;
    }

    protected double rangeWithAirConOn() {
        return getTankCapacity() / (getAverageFuelConsumption() + airConConsumption);
    }

    protected double rangeWithAirConOff() {
        return getTankCapacity() / getAverageFuelConsumption();
    }
}
