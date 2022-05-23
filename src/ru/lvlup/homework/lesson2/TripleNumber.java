package ru.lvlup.homework.lesson2;

import java.util.Random;

public class TripleNumber {
    void largestNumeral(){
        Random r = new Random();
        int secretNumber = r.nextInt(900) + 100;
        System.out.println("Случайное число - " + secretNumber);
        int lastDigit = secretNumber % 10;
        int secondDigit = (secretNumber / 10) % 10;
        int firstDigit = secretNumber / 100;

        if ((firstDigit > secondDigit) && (firstDigit > lastDigit)){
            System.out.println("В числе " + secretNumber + " наибольшая цифра " + firstDigit + ".");
        }else if ((secondDigit > firstDigit) && (secondDigit) > lastDigit){
            System.out.println("В числе " + secretNumber + " наибольшая цифра " + secondDigit + ".");
        }else if ((lastDigit > firstDigit) && (lastDigit > secondDigit)){
            System.out.println("В числе " + secretNumber + " наибольшая цифра " + lastDigit + ".");
        }else if ((lastDigit == firstDigit) && (lastDigit > secondDigit)){
            System.out.println("В числе " + secretNumber + " наибольшая цифра " + lastDigit + ".");
        }else if ((lastDigit == secondDigit) && (lastDigit > firstDigit)){
            System.out.println("В числе " + secretNumber + " наибольшая цифра " + lastDigit + ".");
        }else if ((firstDigit == secondDigit) && (firstDigit > lastDigit)){
            System.out.println("В числе " + secretNumber + " наибольшая цифра " + firstDigit + ".");
        }else System.out.println("Все цифры равны");
    }
    public static void main(String[] args){
            TripleNumber number = new TripleNumber();
            number.largestNumeral();
    }
}
