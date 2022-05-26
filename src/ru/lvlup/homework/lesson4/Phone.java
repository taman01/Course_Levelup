package ru.lvlup.homework.lesson4;

public class Phone {

    int number;
    String model;
    Double weight;

    void receiveCall (String name){
        System.out.println("Звонит " + name);
    }
    int getNumber(){
        return number;
    }

    Phone (int phoneNumber, String phoneModel, Double phoneWeight){
        number = phoneNumber;
        model = phoneModel;
        weight = phoneWeight;
    }
    Phone (int phoneNumber, String phoneModel){
        number = phoneNumber;
        model = phoneModel;
    }
    Phone (){
    }

    void receiveCall(String name, int number){
        System.out.println("Звонит " + name + " с телефона " + number);
    }

    void sendMessages (String[] numberForMessages){
        for (int i = 0; i < numberForMessages.length; i++){
            System.out.println("На номер "+ numberForMessages[i] + " было отправлено сообщение с номера" + " " + number);
        }
    }

}
