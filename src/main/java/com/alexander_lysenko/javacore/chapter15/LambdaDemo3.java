package main.java.com.alexander_lysenko.javacore.chapter15;

public class LambdaDemo3 {
    public static void main(String[] args) {
        // в этом выражении проверяется, являеется ли
        // одно число множителем другого
        NumericTest2 isFactor = (n,d) -> (n % d) == 0;

        if(isFactor.test(10,2)) System.out.println("2 is factor for 10");
        if(isFactor.test(10,3)) System.out.println("3 isn't factor for 10");
    }
}
