package ru.lvlup.homework.lesson6.task1;

public class Main {

    private Class[] classes;

    public Main(){
        this.classes = new Class[]{
                new Class("Имя","Другое имя",12),
                new Class("Евгений","Джон",12),
                new Class("Не придумал","Тоже также",15)
        };
    }

    public boolean searchInMassive(Class clas){
        for (int i = 0; i < classes.length; i++){
            if (classes[i].equals(clas)){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Class c1 = new Class("Имя","Другое имя",12);
        Class c2 = new Class("Евгений","Джон",12);
        Class c3 = new Class("Не придумал","Тоже также",15);
        Class c4 = new Class("Новый","Старый",85);


        Main main = new Main();
        System.out.println(main.searchInMassive(c1));
        System.out.println(main.searchInMassive(c2));
        System.out.println(main.searchInMassive(c3));
        System.out.println(main.searchInMassive(c4));


        System.out.println("Сравнение: " + c1.equals(c2));

    }

}
