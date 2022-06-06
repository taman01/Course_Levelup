package ru.lvlup.lesson7;

// 1. Нет конструкторов
// 2. Все методы интерфейса являются абстрактными и публичными
//      - с 8-ой Java появились default методы
//      - с 9-ой Java появились private методы
// 3. Поля интерфейса являются константами - public static final

public interface ListInterface {

    int get(int index);

    void add(int value);


}
