package ru.lvlup.lesson7;

public abstract class AbstractList implements ListInterface {

    protected int size;

    public int getSize(){
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(int value){
        addElements(value);
    }

  //  public abstract int get(int index);

    public abstract void addElements(int value);

}
