package ru.lvlup.homework.lesson5.task4;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("едой","локации");
        Cat cat = new Cat("рыбой","доме");
        Dog dog = new Dog("мясом","будке");
        Horse horse = new Horse("травой","поле");

        animal.makeNoise();
        cat.makeNoise();
        dog.makeNoise();
        horse.makeNoise();
        System.out.println();

        Veterinarian veterinarian = new Veterinarian();


        Animal[] animals = new Animal[]{cat,dog,horse};
        for (int i = 0; i < animals.length; i++){
            veterinarian.treatAnimal(animals[i]);
        }
    }

}
