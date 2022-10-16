package main.java.com.alexander_lysenko.javacore.chapter10;

//продемонстрировать цепочки исключений
public class ChainExcDemo {
    static void demoproc() {
        // создать исключение
        NullPointerException e = new NullPointerException("Верхний уровень");
        // добавить причину исключения
        e.initCause(new ArithmeticException("причина"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e ) {
            // вывести исключение верхнего уровня
            System.out.println("Перехвачено исключение " + e);

            //Вывести исключение, послужившее причиной
            // для исключения верхнего уровня
            System.out.println("Первопричина " + e.getCause());
        }
    }
}
