package Seminar1;

import java.util.ArrayList;

public interface Machine {
    ArrayList<Product> getProduct(String name) throws IllegalStateException;
}
