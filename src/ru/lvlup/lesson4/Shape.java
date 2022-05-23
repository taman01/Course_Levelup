package ru.lvlup.lesson4;

public class Shape {

        int order;
       private String name;

        Shape (String shapeName) {
                name = shapeName;
        }
        Shape (int shapeOrder, String shapeName){
                order = shapeOrder;
                name = shapeName;
        }

        public String getName(){
                return name;
        }

}
