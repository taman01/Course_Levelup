package ru.lvlup.lesson7;

public class ListElements {

    private ListElements next;
    private int value;

    public ListElements(int value){
        this.value = value;
    }

    public ListElements getNext() {
        return next;
    }

    public void setNext(ListElements next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
