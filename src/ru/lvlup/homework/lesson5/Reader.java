package ru.lvlup.homework.lesson5;

public class Reader {

    private String fullName;
    private int numberOfTicket;
    private String faculty;
    private String birthdate;
    private int numberPhone;

    public Reader(String fullName, int numberOfTicket, String faculty, String birthdate, int numberPhone) {
        this.fullName = fullName;
        this.numberOfTicket = numberOfTicket;
        this.faculty = faculty;
        this.birthdate = birthdate;
        this.numberPhone = numberPhone;
    }

    public String getFullName(){
        return fullName;
    }

    public void takeBook(String fullName, int numberOfBook){
        this.fullName = fullName;
        System.out.println(fullName + " взял " + numberOfBook + " книг.");
    }

    public void takeBook(String fullName, String[] nameOfBook){
        this.fullName = fullName;
        System.out.print(fullName + " взял книги: ");
        for (int i = 0; i < nameOfBook.length; i++){
            if (i == (nameOfBook.length - 1)){
                System.out.println(nameOfBook[i] + ".");
            } else
            System.out.print(nameOfBook[i] + ", ");

        }
    }

    public void takeBook(Book book){
        System.out.println(book);// не понял, что нужно сделать с классом Book
    }

    public void returnBook(String fullName, int numberOfBook){
        this.fullName = fullName;
        System.out.println(fullName + " Вернул " + numberOfBook + " книг.");
    }

    public void returnBook(String fullName, String[] nameOfBook){
        this.fullName = fullName;
        System.out.print(fullName + " вернул книги: ");
        for (int i = 0; i < nameOfBook.length; i++){
            if (i == (nameOfBook.length - 1)){
                System.out.println(nameOfBook[i] + ".");
            } else
                System.out.print(nameOfBook[i] + ", ");

        }
    }

}
