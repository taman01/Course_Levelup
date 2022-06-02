package ru.lvlup.homework.lesson5.task4;

public class Dog extends Animal {

    public Dog(String food, String location) {
        super(food, location);
    }
    @Override
    public void makeNoise(){
        System.out.println("Собака кричит");
    }
    @Override
    public void eat() {
        System.out.println("Собака ест");
    }
    @Override
    public void sleep(){
        System.out.println("Собака спит");
    }
}
