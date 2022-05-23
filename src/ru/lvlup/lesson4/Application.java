package ru.lvlup.lesson4;



public class Application {
    public static void main(String[] args) {

        Shape figure = new Shape("Фигура1"); // Shape() {}

        System.out.println(figure.getName());
        System.out.println(figure.getName().toUpperCase());

        Shape shape = new Shape("Форма2");
        System.out.println(shape.getName().toUpperCase());

        Shape shapeWithOrder = new Shape(4,"Имя");
        System.out.println(shapeWithOrder.order + " " + shapeWithOrder.getName());

    }
}
