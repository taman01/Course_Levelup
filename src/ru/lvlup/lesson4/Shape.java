package ru.lvlup.lesson4;

public class Shape {

       private int order;
       protected String name;

       protected int[] sides;

    public Shape(){
        System.out.println("Конструктор фигуры");
    }

    public Shape (String name) {
                this(1,name);
        }
    public Shape (int shapeOrder, String shapeName){
                order = shapeOrder;
                name = shapeName;
        }

        public Shape (int order, String name, int[] sides){
        this.order = order;
        this.name = name;
        this.sides = sides;
        }

    public int getOrder() {
        return order;
    }

    //Геттер
        public String getName(){
                return name;
        }
        //Сеттер
        //public void set<Field_name>(<field_type>) {field = field_name;}
        public void setName(String name){
            this.name = name;
        }

        public double calculatePerimeter(){
        int perimeter = 0;
        for(int i = 0; i < sides.length; i++){
            perimeter = perimeter + sides[i];
        }
        return perimeter;
        }

        public double calculateSquare(){
        return 0;
        }

}
