package ru.lvlup.homework.lesson3;

import java.util.Scanner;

public class NumberDivisors {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.print("Все делители числа " + number + ": ");
        for (int i = 1; i <= number; i++ ){
            if ((number % i) == 0){
                System.out.print(i + " ");
            }
        }
    }
}
