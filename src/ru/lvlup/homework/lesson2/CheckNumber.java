package ru.lvlup.homework.lesson2;

import java.util.Random;

public class CheckNumber {
    void checkNumber() {
        Random r = new Random();
        int secretNumber = r.nextInt(151) + 5;

        if ((secretNumber > 25) && (secretNumber < 100)){
            System.out.println("Число " + secretNumber + " содержится в интервале (25,100)");
        }else {
            System.out.println("Число " + secretNumber + " не содержится в интервале (25,100)");
        }
    }

    public static void main(String[] args) {
        CheckNumber number = new CheckNumber();
        number.checkNumber();
    }
}
