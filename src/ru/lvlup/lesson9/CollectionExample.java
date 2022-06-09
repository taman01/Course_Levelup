package ru.lvlup.lesson9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionExample {

    public static void main(String[] args) {

        List<String> products = new ArrayList<>();

        products.add("Молоко");
        products.add("Сыр");
        products.add("Помидоры");
        products.add("Огурец");
        products.add("Хлеб");
        products.add("Молоко");

        System.out.println("Размер: " + products.size());
        System.out.println("Есть молоко? " + products.contains("Молоко"));
        System.out.println("Есть шоколад? "  + products.contains("шоколад"));

        //indexOf  - имеется внутри списка значение и возвращает его индекс

        System.out.println("Индекс Помидор: " + products.indexOf("Помидоры"));
        System.out.println("Последний индекс молока: " + products.lastIndexOf("Молоко"));

        System.out.println();
        System.out.println("Удаление продуктов");
        products.remove("Молоко");

        System.out.println();
        System.out.println("Лист Продуктов");

        // for-each - сокращенный for
       // for (<Type of collections element> <var> : <collections object>
        for(String element : products){
            System.out.println(element);
        }

        Collection<Integer> integers = new ArrayList<>();
        integers.add(4);
        integers.add(5);
        integers.add(6);
        System.out.println();
        for(Integer val : integers){
            System.out.println(val);
        }


    }

}
