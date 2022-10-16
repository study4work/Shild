package main.java.com.alexander_lysenko.javacore.chapter10;

public class Exc2 {
    public static void main(String[] args) {
        int d, a;
        try {
            d = 0;
            System.out.println("Код еще выполняется");
            a = 42 / d;
            System.out.println("Это не будет выведено");
        } catch (ArithmeticException e) { // перехват ошибки деления на ноль
            System.out.println("Деление на ноль");
        }
        System.out.println("Полсе оператора catch");
    }
}
