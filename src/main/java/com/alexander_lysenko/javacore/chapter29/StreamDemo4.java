package main.java.com.alexander_lysenko.javacore.chapter29;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();

        myList.add(7.0);
        myList.add(13.0);
        myList.add(54.0);
        myList.add(22.0);
        myList.add(11.0);

        Stream<Double> sqrt = myList.stream().map(a -> Math.sqrt(a));

        double productSqrt = myList.stream().reduce(1.0, (a,b) -> a * b);

        System.out.println(productSqrt);
    }
}
