package ru.lvlup.lesson3;

public class Point {

    int x;
    int y;
    // Сигнатура метода: changeCoordinates(int, int)
    void changeCoordinates(int xCoordinate, int yCoordinate) {
        x = xCoordinate;
        y = yCoordinate;
    }
        // Меняет координаты точки с + на -
    // Сигнатура: flip()
    void flip (){
        x = -x;
        y = -y;
    }
    // метод квадрантов
    // результат работы метода число от 1 до 5
//
    int quadrant(){
        int q = 0;
        if (x > 0 && y > 0){
            return 1;
        }else if (x < 0 && y > 0){
            return 2;
        }else if (x < 0 && y < 0){
            return 3;
        }else if (x > 0 && y < 0){
            return 4;
        }else{
            return 5;
        }

    }
    // p1.method -> "(x, y)"
    String prettyString(){
     //   String s = "(" + x + ", " + y + ")";
        return "(" + x + ", " + y + ")";
    }
    void printPoint(){
        String s = prettyString();
        System.out.println(s);
    }

    void printPoint (boolean prettyView){
        if (prettyView){
            System.out.println(prettyString());
        }else {
            System.out.println(x + " " + y);
        }
    }
    // int m(double a, int b) {...}

    // 1.
    // 2.
    // 3.
    // 4.
}


