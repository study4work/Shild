package main.java.com.alexander_lysenko.javacore.chapter15;

public class BlockLambdaDemo2 {
    // Это блочное выражение изменяет на обратный
    // порядок следования символов в строке
    public static void main(String[] args) {
        StringFunc revers = (str) -> {
            String result = "";
            int i;

            for (i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        System.out.println("Lambda turned into a: " + revers.func("lambda"));
        System.out.println("Function turned into a: " + revers.func("function"));
    }
}
