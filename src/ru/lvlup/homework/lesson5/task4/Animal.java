package ru.lvlup.homework.lesson5.task4;

public class Animal {

    protected String food;
    protected String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

   public void makeNoise(){
        System.out.println("Такое-то животное кричит");
    }
    public void eat(){
        System.out.println("Такое-то животное ест");
    }
    public void sleep(){
        System.out.println("Такое-то животное спит");
    }
}
