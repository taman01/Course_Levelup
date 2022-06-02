package ru.lvlup.homework.lesson5;

public class CalculatorApp {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println("Сложение:");
        System.out.println(calculator.sum(10,5));
        System.out.println(calculator.sum(10.5,5.5));
        System.out.println(calculator.sum(8954613548L,846546852L));
        System.out.println();
        System.out.println("Вычитание:");
        System.out.println(calculator.sub(10,5));
        System.out.println(calculator.sub(10.5,5.5));
        System.out.println(calculator.sub(8954613548L,846546852L));
        System.out.println();
        System.out.println("Деление:");
        System.out.println(calculator.div(10,5));
        System.out.println(calculator.div(10.5,5.5));
        System.out.println(calculator.div(8954613548L,846546852L));
        System.out.println();
        System.out.println("Умножение:");
        System.out.println(calculator.multi(10,5));
        System.out.println(calculator.multi(10.5,5.5));
        System.out.println(calculator.multi(8954613548L,846546852L));
    }

}
