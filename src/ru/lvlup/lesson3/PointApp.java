package ru.lvlup.lesson3;

public class PointApp {
    public static void main(String[] args) {

        // object, reference, instance - объект, ссылка, экземпляр
        int xp1 = 4;
        Point p1 = new Point();
        p1.x = 5;
        p1.y = 7;

        Point p2 = new Point();
        p2.x = 8;
        p2.y = 8;

        System.out.println(p1.x + " " + p2.x);

        int coor = 12;
        p1.changeCoordinates(9,coor);

    }
}
