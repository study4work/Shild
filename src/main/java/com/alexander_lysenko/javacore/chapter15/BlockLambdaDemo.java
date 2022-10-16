package main.java.com.alexander_lysenko.javacore.chapter15;

public class BlockLambdaDemo {
    public static void main(String[] args) {
        // Это блочное лямба выражение вычисляет
        // факториал, целочисленного значения
        NumericFunc factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return  result;
        };
        System.out.println("Factorial result for 3 is: " + factorial.func(3));
        System.out.println("Factorial result for 5 is: " + factorial.func(5));
    }
}
