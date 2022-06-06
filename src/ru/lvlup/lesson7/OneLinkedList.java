package ru.lvlup.lesson7;

// Класс реализует интерфейс
public class OneLinkedList extends AbstractList{

    private ListElements head;  //null

    private ListElements tail;  //null

    @Override
    public void addElements(int value) {
        ListElements newElement = new ListElements(value);
        if (head == null) {
            head = newElement;
            tail = newElement;
        }else {
            tail.setNext(newElement);
            tail = newElement;
        }
        size++;
    }

    @Override
    public int get(int index) {
        return 0;
    }
}
