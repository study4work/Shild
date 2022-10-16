package main.java.com.alexander_lysenko.javacore.chapter10;

public class ThrowsDemo {
    static void throwsOne() throws IllegalArgumentException {
        System.out.println("В теле метода throwsOne()");
        throw new IllegalArgumentException("демонстрация");
    }

    public static void main(String[] args) {
        try {
            throwsOne();
        } catch (IllegalArgumentException e) {
            System.out.println("Перехвачено исключение " + e);
        }
    }
}
