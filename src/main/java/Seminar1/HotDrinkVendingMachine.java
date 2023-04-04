package Seminar1;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine implements Machine {

    private final List<Product> products;

    public HotDrinkVendingMachine(List<Product> products) {
        this.products = products;
    }

    public ArrayList<Product> getProduct(String name) {
        ArrayList<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                result.add(product);
            }
        }
        return result;
    }

    public ArrayList<Product> getProduct(String name, double temperature) {
        ArrayList<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().contains(name) && ((HotDrink) product).getTemperature() == temperature){
                result.add(product);
            }
        }
        return result;
    }

    public ArrayList<Product> getProduct(String name, int volume, double temperature) {
        ArrayList<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().contains(name) && ((HotDrink) product).getVolume() == volume && ((HotDrink) product).getTemperature() == temperature) {
                result.add(product);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "HotDrinkVendingMachine{" +
                "products=" + products +
                '}';
    }
}
