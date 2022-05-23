package ru.lvlup.lesson3;

public class Array {
    public static void main(String[] args) {

        double price1 = 345.65;
        double price2 = 546.58;
        double price3 = 64.65;
        double price4 = 12.78;

        double avgPrice = (price1 + price2 + price3 + price4) / 4;
        System.out.println("Average price " + avgPrice);


        double[] prices = new double[4];
        prices[0] = price1;
        prices[1] = price2;
        prices[2] = price3;
        prices[3] = price4;

        for (int i = 0; i < prices.length; i++){
            int number = i + 1;
            System.out.println(number + " - " + prices[i]);
        }

        double sum = 0;
        for (int i = 0; i < prices.length; i++){
            sum = sum + prices[i];
        }
        double avg = sum/prices.length;
        System.out.println("Average price : " + avg);

    }
}
