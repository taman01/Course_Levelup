package ru.lvlup.lesson5;

import ru.lvlup.lesson4.Shape;

public class ShapeService  {

    public void printShapeSquare (Shape shape){
        System.out.println("Площадь фигуры: " + shape.calculateSquare());
    }

    public void printRectangleSquare(Rectangle rectangle){
        System.out.println("Площадь фигуры: " + rectangle.calculateSquare());
    }

}
