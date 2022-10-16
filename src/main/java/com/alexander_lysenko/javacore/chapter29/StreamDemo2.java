package main.java.com.alexander_lysenko.javacore.chapter29;

import java.util.ArrayList;
import java.util.Optional;

public class StreamDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        Optional<Integer> productObj = myList.stream().reduce((a, b) -> a * b);
        if(productObj.isPresent()) System.out.println("In object optional: " + productObj.get());

        int product = myList.stream().reduce(1, (a, b) -> a * b);
        System.out.println("In int type " + product);

        int evenProduct = myList.stream().reduce(1, (a, b) -> {
            if ((b % 2) == 0) {
                return a * b;
            } else return a;
        });
        System.out.println( evenProduct);
    }
}
