package main.java.com.alexander_lysenko.javacore.chapter29;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo10 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Alfa");
        myList.add("Betta");
        myList.add("Omega");
        myList.add("Alfa2");
        myList.add("Alfa3");

        Stream<String> myStream = myList.stream();
        Spliterator<String> spliterator = myStream.spliterator();
        Spliterator<String> spliterator2 = spliterator.trySplit();

        if (spliterator2 != null) {
            System.out.println("Spliterator 2: " );
            spliterator2.forEachRemaining(System.out::println);
        }

        System.out.println("spliterator: ");
        spliterator.forEachRemaining(System.out::println);
    }
}
