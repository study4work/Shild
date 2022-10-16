package main.java.com.alexander_lysenko.javacore.chapter29;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo9 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Alfa");
        myList.add("Betta");
        myList.add("Omega");
        myList.add("Alfa2");
        myList.add("Alfa3");

        Stream<String> myStream = myList.stream();
        Spliterator<String> spliterator = myStream.spliterator();
        while (spliterator.tryAdvance(n -> System.out.println(n)));
    }
}
