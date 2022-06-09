package ru.lvlup.lesson9;

public class DivideOnZeroException extends Exception {

    public DivideOnZeroException(){
        super("Не может быть равным нулю");
    }

}
