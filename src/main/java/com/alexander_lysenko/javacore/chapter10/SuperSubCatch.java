package main.java.com.alexander_lysenko.javacore.chapter10;

public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42/a;
        } catch (Exception e) {
            System.out.println("Перехва общего исключения Exception" + e);
        }
        /*
        Этот catch не будет достигнут, т.к.
        подкласс ArithmeticExeption является подклассом Exception
         */

        //catch (ArithmeticException e) {
        //  System.out.println("Код недостижим");
        //}
    }
}
