package ru.lvlup.homework.lesson3;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int n = 1;
        for (int i = 1; i <= number; i++){
            n = i * n;
        }
        System.out.println("Факториал числа " + number + " равен " +  n);
    }
}
