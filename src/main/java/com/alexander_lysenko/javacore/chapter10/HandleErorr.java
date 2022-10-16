package main.java.com.alexander_lysenko.javacore.chapter10;

import java.util.Random;

// перехватить исключение и продолжить работу
public class HandleErorr {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;

        Random r = new Random();

        for (int i = 0; i < 32000; i++) {
            try {
             b = r.nextInt();
             c = r.nextInt();
             a = 12345 / (b/c);
            } catch (ArithmeticException e) {
                System.out.println("Деление на ноль");
                System.out.println("Исключени: " + e); // вывод исключения ,благодаря методу переопределенному toString
                                                       // в классе trowable
                a = 0; // присвоить ноль и продолжить работу
            }
            System.out.println("a: " + a);
        }
    }
}
