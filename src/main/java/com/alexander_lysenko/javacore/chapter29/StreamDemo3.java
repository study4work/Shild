package main.java.com.alexander_lysenko.javacore.chapter29;

import java.util.ArrayList;

public class StreamDemo3 {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();

        myList.add(7.0);
        myList.add(13.0);
        myList.add(54.0);
        myList.add(22.0);
        myList.add(11.0);

        double posr = myList.parallelStream().reduce(1.0,
                (a, b) -> a * Math.sqrt(b),
                (a, b) -> a * b);

        System.out.println(posr);

    }
}
