package ru.lvlup.homework.lesson5;

public class Library {

    private Reader[] readers;

    public Library(){
        this.readers = new Reader[] {
                new Reader("Томанов Евгений Валерьевич",123, "Энергомашиностроительный факультет","30.05.1994",79811233),
                new Reader("Иванов Иван Иванович",124, "Юридический факультет","21.08.1995",79811223),
                new Reader("Егоров Егор Егорович",125, "Электро-механический факультет","18.06.1996",79811245)
        };


    }







    public static void main(String[] args) {

        Reader r1 = new Reader("Томанов Евгений Валерьевич",123, "Энергомашиностроительный факультет","30.05.1994",79811233);
        Reader r2 = new Reader("Иванов Иван Иванович",124, "Юридический факультет","21.08.1995",79811223);
        Reader r3 = new Reader("Егоров Егор Егорович",125, "Электро-механический факультет","18.06.1996",79811245);

        Book b1 = new Book("Имя", "автор");

        r1.takeBook(r1.getFullName(), 5);
        r2.takeBook(r2.getFullName(), 6);
        r3.takeBook(r3.getFullName(), 7);
        System.out.println();

        r1.takeBook(r1.getFullName(), new String[]{"Приключения", "Словарь", "Энциклопедия"});
        System.out.println();

        System.out.println(b1.book()); // не понял в 3 задачи пункт 3...
        System.out.println();

        r1.returnBook(r1.getFullName(), 5);
        r2.returnBook(r2.getFullName(), 6);
        r3.returnBook(r3.getFullName(), 7);
        System.out.println();

        r1.returnBook(r1.getFullName(), new String[]{"Приключения", "Словарь", "Энциклопедия"});
        System.out.println();


    }


}
