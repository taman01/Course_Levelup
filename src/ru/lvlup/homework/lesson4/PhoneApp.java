package ru.lvlup.homework.lesson4;

public class PhoneApp {
    public static void main(String[] args) {
        Phone mark1 = new Phone();
            mark1.number = 1992393;
            mark1.model = "Ипхоне 12 мини";
            mark1.weight = 134.5;

        Phone mark2 = new Phone();
            mark2.number = 1993293;
            mark2.model = "Ипхоне 12 проАйсикьюМакс";
            mark2.weight = 190.5;

        Phone mark3 = new Phone();
            mark3.number = 1992339;
            mark3.model = "КСЯОМИ РЕДМИ100500";
            mark3.weight = 155.5;

        System.out.println("Номер телефона: "+ mark1.number);
        System.out.println("Модель телефона: "+ mark1.model);
        System.out.println("Вес телефона: "+ mark1.weight);
        System.out.println();

        System.out.println("Номер телефона: "+ mark2.number);
        System.out.println("Модель телефона: "+ mark2.model);
        System.out.println("Вес телефона: "+ mark2.weight);
        System.out.println();

        System.out.println("Номер телефона: "+ mark3.number);
        System.out.println("Модель телефона: "+ mark3.model);
        System.out.println("Вес телефона: "+ mark3.weight);
        System.out.println();

        mark1.receiveCall("Санек");
        mark2.receiveCall("Женек");
        mark3.receiveCall("Иииигоорь");
        System.out.println();

        System.out.println("Номера в телефонной книге:");
        System.out.println("Санек - " + mark1.getNumber());
        System.out.println("Женек - " + mark2.getNumber());
        System.out.println("Иииигорь - " + mark3.getNumber());
        System.out.println();

        mark3.receiveCall("Иииигорь",mark3.getNumber());
        System.out.println();

        mark2.sendMessages(new String[]{"4651325","351321","6546132","654651","545312"});
        /*Возможно, не совсем правильно понял последнее задание. Нужно ли сделать так,
        чтобы номер, с которого было отправлено сообщение передавалось в метод
        через getNumber?
         */


    }
}
