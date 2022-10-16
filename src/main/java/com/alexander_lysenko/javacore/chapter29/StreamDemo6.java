package main.java.com.alexander_lysenko.javacore.chapter29;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.IntStream;

public class StreamDemo6 {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();

        myList.add(7.2);
        myList.add(13.3);
        myList.add(54.7);
        myList.add(22.4);
        myList.add(11.0);

        myList.stream().forEach(System.out::println);

        IntStream cStr = myList.stream().mapToInt(value -> (int) Math.ceil(value));
        cStr.forEach(System.out::println);
    }
}
