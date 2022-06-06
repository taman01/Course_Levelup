package ru.lvlup.lesson7;

public class ListApp {

    public static void main(String[] args) {

        ListArray listArray = new ListArray(4);
        listArray.addElement(11);
        listArray.addElement(40);
        listArray.addElement(79);
        listArray.addElement(67);
        listArray.addElement(34); //список должен автоматически увеличить свой размер


        System.out.println(listArray.toString());
        System.out.println("Размер: " + listArray.getSize());
        System.out.println("Элемент под индексом 4: " + listArray.get(4));

    }

}
