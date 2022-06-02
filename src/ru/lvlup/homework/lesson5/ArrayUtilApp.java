package ru.lvlup.homework.lesson5;

public class ArrayUtilApp {

    public static void main(String[] args) {
        ArrayUtil a = new ArrayUtil();
        System.out.println("Минимальное число в переданном массиве: " + a.min(new int[] {12,11,5,8,10}));
        System.out.println("Максимальное число в переданном массиве: " + a.max(new int[] {12,11,5,8,10}));
    }

}
