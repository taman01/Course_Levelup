package ru.lvlup.lesson7;
// Список на основе массива (динамический массив)
// 1. Добавление элемента (в начало, в середину, в конец)
// 2. Удаление элемента (из начала, из середины, из конца)
// 3. Получение элемента по индексу
public class ListArray extends AbstractList {

    private int[] elements;  // элементы списка
    // private int size;
    // количество элементов в СПИСКЕ


    // initialCapacity - первоначальный размер массива
    public ListArray (int initialCapacity) {
        this.elements = new int[initialCapacity];
    }
    // Добавление в конец списка - хранение элементов в порядке их добавления
    // {} , [0,0,0,0], size = 0
    //
    public void addElement(int value){
        if (size == elements.length){ //массив заполнен, необходимо увеличить

            int[] oldArray = elements;
            elements = new int[2 * oldArray.length];
            System.arraycopy(oldArray, 0, elements, 0, oldArray.length);

        }
            elements[size] = value;
            size = size + 1;
    }

    @Override
    public int get(int index) {
        return elements[index];
    }

    @Override
    public String toString(){
        if (size == 0){
            return "{}";
        }
        String s = "{";
        for (int i = 0; i < size; i++){
            s = s + elements[i] + ", ";
        }
        return s + "}";
    }

    @Override
    public void addElements(int value) {

    }
}
