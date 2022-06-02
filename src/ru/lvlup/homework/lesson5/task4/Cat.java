package ru.lvlup.homework.lesson5.task4;

public class Cat extends Animal {
    public Cat(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise(){
        System.out.println("Кошка кричит");
    }
    @Override
    public void eat() {
        System.out.println("Кошка ест");
    }
    @Override
    public void sleep(){
        System.out.println("Кошка спит");
    }
    String getCat(String name){
        return name;
    }

}
