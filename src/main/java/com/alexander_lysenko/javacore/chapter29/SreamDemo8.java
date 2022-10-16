package main.java.com.alexander_lysenko.javacore.chapter29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

public class SreamDemo8 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Alfa");
        myList.add("Betta");
        myList.add("Omega");
        myList.add("Alfa2");
        myList.add("Alfa3");

        Stream<String> myStream = myList.stream();
        Iterator<String> itr = myStream.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }


}
