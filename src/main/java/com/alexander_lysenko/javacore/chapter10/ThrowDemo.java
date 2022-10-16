package main.java.com.alexander_lysenko.javacore.chapter10;

public class ThrowDemo {
    static void demoproc() {
        try {
            throw new NullPointerException("Демонстрация");
        } catch (NullPointerException e) {
            System.out.println("Исключение перехвачено в теле метода demoproc");
            throw e; // Повторно сгенерировать исключение.
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Повторный перехват NPE" + e);
        }
    }
}
