package ru.lvlup.lesson8;

import ru.lvlup.lesson7.ListInterface;

public class InterfaceService {

    public void printRange(ListInterface list, int start, int end){
        for (int i = start; i < end; i++) {
            int value = list.get(i);
            System.out.println(value);
        }
    }

}
