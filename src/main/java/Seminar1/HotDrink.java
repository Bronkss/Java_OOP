package Seminar1;

public class HotDrink extends Product{
    private double temperature;
    private int volume;

    public HotDrink(String name, Double cost, double temperature, int volume) {
        super(name, cost);
        this.temperature = temperature;
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public Double getCost() {
        return super.getCost();
    }

    @Override
    public void setCost(Double cost) {
        super.setCost(cost);
    }

    public HotDrink(String name, Double cost, double temperature) {
        super(name, cost);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name = " + super.getName() + '\'' +
                ", volume = " + this.volume + '\'' +
                ", temperature = " + this.temperature + '\'' +
                ", cost = " + super.getCost() +
                '}';
    }
}
