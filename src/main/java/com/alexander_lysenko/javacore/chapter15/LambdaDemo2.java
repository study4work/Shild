package main.java.com.alexander_lysenko.javacore.chapter15;

public class LambdaDemo2 {
    public static void main(String[] args) {
        //Лямбда выражение, проверяющее, является ли число четным
        NumericTest isEven = (n) -> (n % 2) == 0;

        if (isEven.test(10)) System.out.println("10 is even");
        if (!isEven.test(9)) System.out.println("9 isn't even");

        // Теперь воспользуемся лямба вражением в котором проверяется является ли число не отрицательным

        NumericTest isNoNeg = (n) -> n >= 0;

        if (isNoNeg.test(1)) System.out.println("1 is positive");
        if (!isNoNeg.test(-1)) System.out.println("1 is negative");
    }
}
