package main.java.com.alexander_lysenko.javacore.chapter29;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(4);
        myList.add(5);
        myList.add(24);
        myList.add(31);
        myList.add(1);
        System.out.print(myList);
        Stream<Integer> myStream = myList.stream();
        Optional<Integer> minVal = myStream.min(Integer::compare);
        if (minVal.isPresent()) System.out.println(minVal.get());

        myStream = myList.stream();
        Optional<Integer> maxVal = myStream.max(Integer::compare);
        if (maxVal.isPresent()) System.out.println(maxVal.get());

        Stream<Integer> sortedStream = myList.stream().sorted();
        sortedStream.forEach(System.out::println);

        Stream<Integer> oddVals = myList.stream().filter(n -> (n % 2) == 1);
        oddVals.forEach(System.out::println);

        oddVals = myList.stream().filter(n -> (n % 2) == 1)
                .filter(n -> n > 5);
        oddVals.forEach(System.out::println);


    }
}
