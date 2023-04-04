package Seminar1;

import java.util.ArrayList;
import java.util.List;

public class BottleOfWaterVendingMachine implements Machine {
    private final List<Product> products;

    public BottleOfWaterVendingMachine(List<Product> products) {
        this.products = products;
    }

    public ArrayList<Product> getProduct(String name){
        ArrayList<Product> result = new ArrayList<>();
        for(Product product: products){
            if(product.getName().equalsIgnoreCase(name)) {
                result.add(product);
            }
        }
        return result;
    }

    public ArrayList<Product> getProduct(String name, int volume){
        ArrayList<Product> result = new ArrayList<>();
        for(Product product: products){
            if(product instanceof BottleOfWater){
                if(product.getName().equalsIgnoreCase(name) && ((BottleOfWater) product).getVolume() == volume){
                   result.add(product);
                }
            }

        }
        return result;
    }

    @Override
    public String toString() {
        return "products = " + products;
    }
}
