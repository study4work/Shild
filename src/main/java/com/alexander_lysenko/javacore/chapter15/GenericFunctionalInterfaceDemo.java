package main.java.com.alexander_lysenko.javacore.chapter15;

public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        // Испольовать строковый вариант интерфейса SomeFunc
        SomeFunc<String> revers = str -> {
            String result = "";
            int i;

            for (i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };
        System.out.println("Lambda turned into a: " + revers.func("lambda"));
        System.out.println("Function turned into a: " + revers.func("function"));

        SomeFunc<Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };
        System.out.println("Factorial result for 3 is: " + factorial.func(3));
        System.out.println("Factorial result for 5 is: " + factorial.func(5));
    }
}
