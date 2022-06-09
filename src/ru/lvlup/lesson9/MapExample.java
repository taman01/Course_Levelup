package ru.lvlup.lesson9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

    public static void main(String[] args) {

        Map<String, Double> productPrices = new HashMap<>();
        productPrices.put("Молоко", 64.43);
        productPrices.put("Сыр", 687.23);
        productPrices.put("Помидоры", 301.47);
        productPrices.put("Огурцы", 189.76);
        productPrices.put("Хлеб", 96.81);

        System.out.println("Молоко на месте? " + productPrices.containsKey("Молоко"));

        Set<String> keys = productPrices.keySet();
        for (String key : keys
             ) {
            Double price = productPrices.get(key);
            System.out.println(key + " стоят " + price);
        }



    }

}
