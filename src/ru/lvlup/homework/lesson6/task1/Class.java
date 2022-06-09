package ru.lvlup.homework.lesson6.task1;

import java.util.Objects;

public class Class {

    private String name;
    private String anotherName;
    private int number;

    public Class(String name, String anotherName, int number) {
        this.name = name;
        this.anotherName = anotherName;
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Class aClass = (Class) o;
        return number == aClass.number && Objects.equals(name, aClass.name) && Objects.equals(anotherName, aClass.anotherName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, anotherName, number);
    }



}
