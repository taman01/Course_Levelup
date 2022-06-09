package ru.lvlup.lesson9;

public class ExceptionExecution {

        public double sqrt(double value){
        if (value < 0){
           // IllegalArgumentException exc = new IllegalArgumentException("Значение должно быть положительным");
            throw new IllegalArgumentException("Значение должно быть положительным");
        }
            return Math.sqrt(value);
        }

        public double division(double a, double b) throws DivideOnZeroException{
            if (b == 0){
               throw new DivideOnZeroException();
            }
            return a/b;
        }

    public static void main(String[] args) {
        ExceptionExecution execution = new ExceptionExecution();

        try {
            double result = execution.division(34, 0);
            System.out.println("Результат деления: " + result);
        }catch (DivideOnZeroException exc){
            System.out.println(exc.getMessage());
            exc.printStackTrace();
        }finally {
            System.out.println("Должно выполняться всегда");
        }

        execution.sqrt(-3);
    }


}
