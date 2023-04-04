package Seminar1;

import java.util.ArrayList;
import java.util.List;


/**
 * Homework:
 * 1. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
 * 2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод
 * getProduct(int name, int volume, int temperature) выдающий продукт соответствующий имени, объему и температуре
 * 3. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику заложенную в программе
 * 4. Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
 */
public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new BottleOfWater("Bonakva", 200.0, 2));
        list.add(new BottleOfWater("Bonakva", 100.0, 1));
        list.add(new BottleOfWater("Akva", 100.0,1));
        list.add(new BottleOfWater("Akva", 200.0,2));
        list.add(new BottleOfWater("Akva", 150.0,2));

        BottleOfWaterVendingMachine waterVendingMachine = new BottleOfWaterVendingMachine(list);

        System.out.println(waterVendingMachine);
        System.out.println(waterVendingMachine.getProduct("Bonakva"));
        System.out.println(waterVendingMachine.getProduct("Akva", 2));

        List<Product> productList = new ArrayList<>();
        productList.add(new HotDrink("BlackCoffee", 200.0, 80, 200));
        productList.add(new HotDrink("GreenTea", 150.0, 70, 200));
        productList.add(new HotDrink("BlackTea", 100.0, 70, 200));
        productList.add(new HotDrink("Latte", 250.0, 80, 300));
        productList.add(new HotDrink("Сappuccino", 300.0, 80, 400));
        productList.add(new HotDrink("Сappuccino", 400.0, 80, 500));

        HotDrinkVendingMachine hotDrinkVendingMachine = new HotDrinkVendingMachine(productList);

        System.out.println(hotDrinkVendingMachine.getProduct("Latte"));
        System.out.println(hotDrinkVendingMachine.getProduct("GreenTea", 200, 70));
        System.out.println(hotDrinkVendingMachine.getProduct("Сappuccino", 80));

    }
}