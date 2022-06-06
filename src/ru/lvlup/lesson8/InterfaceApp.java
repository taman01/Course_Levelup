package ru.lvlup.lesson8;

import ru.lvlup.lesson7.ListArray;
import ru.lvlup.lesson7.ListInterface;
import ru.lvlup.lesson7.OneLinkedList;

public class InterfaceApp {

    public static void main(String[] args) {

        OneLinkedList oneLinkedList = new OneLinkedList();
        //oneLinkedList.add();
        //oneLinkedList.get();

        ListInterface listInterface = new OneLinkedList();

        ListInterface samsungVersionList = new ListArray(4);
        samsungVersionList.add(9);
        samsungVersionList.add(9);
        samsungVersionList.add(10);
        samsungVersionList.add(10);

        ListInterface xiaomiVersionList = new ListArray(4);
        xiaomiVersionList.add(3);
        xiaomiVersionList.add(4);
        xiaomiVersionList.add(5);
        xiaomiVersionList.add(6);

        ListInterface iphoneVersionList = new OneLinkedList();
        iphoneVersionList.add(1);
        iphoneVersionList.add(2);
        iphoneVersionList.add(3);
        iphoneVersionList.add(4);
        iphoneVersionList.add(5);

        InterfaceService is = new InterfaceService();

        is.printRange(samsungVersionList,1,3);
        is.printRange(iphoneVersionList, 2, 4);
        is.printRange(xiaomiVersionList,0,3);



    }

}
