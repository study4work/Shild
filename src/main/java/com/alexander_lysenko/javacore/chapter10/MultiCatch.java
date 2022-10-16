package main.java.com.alexander_lysenko.javacore.chapter10;

//Продемонстрировать многократный перехват
public class MultiCatch {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int[] vals = {1, 2, 3};

        try {
            int result = a/b; //генерируем ArithmeticException

             // vals[10] = 19; //генерируем ArrayIndexOutOfBoundsException
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Исключение перехвачено " + e);
        }
        System.out.println("После многократного перехвата ");
    }
}
