package Seminar1;

public abstract class Product {
    private String name;
    private Double cost;

    @Override
    public String toString() {
        return "name = " + name + ", " + "cost = " + cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Product(String name, Double cost) {
        this.name = name;
        this.cost = cost;
    }
}