package main.java.com.alexander_lysenko.javacore.chapter10;

// демонстрация работы нескольких блоков catch
public class MultiplyCatches {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42/a;
            int[] c = {1};
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль: " + e );
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Выход за предел массива: " + e);
        }
        System.out.println("после блоков оператора try/catch");
    }
}
