package ru.lvlup.lesson5;

import ru.lvlup.lesson4.Shape;

public class Inheritance {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setName("Прямоугольник АБ");

      //  rectangle.width = 3;
      //  rectangle.length = 5;



        Rectangle rectangleWithName = new Rectangle("Конструктор с именем");
        System.out.println(rectangleWithName.getName());

        Rectangle rect = new Rectangle(3,"R3",8,3);
        double perimeter = rect.calculatePerimeter();

        System.out.println(rect.getName() + ": Периметр = " + perimeter);

        Shape shape = new Shape();

        Triangle triangle = new Triangle(4,"Т4",3,4,5);

        System.out.println("Площадь фигуры: " + shape.calculateSquare());
        System.out.println("Площадь прямоугольника: " + rect.calculateSquare());
        System.out.println("Площадь треугольника: " + triangle.calculateSquare());

        System.out.println();
        ShapeService shapeService = new ShapeService();
        shapeService.printShapeSquare(shape);
        shapeService.printShapeSquare(rect);


    }
}
