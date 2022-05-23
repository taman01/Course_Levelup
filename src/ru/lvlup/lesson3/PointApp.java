package ru.lvlup.lesson3;

public class PointApp {
    public static void main(String[] args) {

        // object, reference, instance - объект, ссылка, экземпляр
        int xp1 = 4;
        Point p1 = new Point();
        p1.x = 5;
        p1.y = 7;
        System.out.println(p1.prettyString());
        p1.flip();
        System.out.println(p1.prettyString());

        int result = p1.quadrant();
        System.out.println("Квадрант P1: " + result);

        Point p2 = new Point();
        p2.x = 8;
        p2.y = 8;

        p2.printPoint();
        p2.printPoint(true);
        p2.printPoint(false);

        System.out.println(p1.x + " " + p2.x);

        int coor = 12;
        p1.changeCoordinates(9,coor);

    }
}
