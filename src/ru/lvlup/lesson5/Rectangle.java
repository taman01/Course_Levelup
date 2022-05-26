package ru.lvlup.lesson5;

import ru.lvlup.lesson4.Shape;

public class Rectangle extends Shape {

  //  int width;
  //  int length;

    public Rectangle(){
        super();
        System.out.println("Конструктор прямоугольника");
    }

    public Rectangle(String name){
        super(name);
    }

    public Rectangle(int order, String name, int width, int length){
        super(order, name, new int[] { width, length, width, length});
    }

    public int getWidth(){
        return sides[0];
    }

    public int getLength(){
        return sides[1];
    }

    @Override
    public double calculateSquare() {
        return getLength() * getWidth();
    }


    //   public double calculatePerimetr(){
  //      return width * 2 + length * 2;
   // }

}
