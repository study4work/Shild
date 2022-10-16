package main.java.com.alexander_lysenko.javacore.chapter29;

import java.util.ArrayList;

public class StreamDemo5 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("larry", "555-555", "L@.com"));
        myList.add(new NamePhoneEmail("alex", "666-555", "A@.com"));
        myList.add(new NamePhoneEmail("wheel", "777-555", "W@.com"));

        myList.stream().forEach(a -> System.out.println(a.name + a.email + a.phonenum));

        myList.stream().map(a -> new NamePhone(a.name, a.phonenum)).forEach(System.out::println);


    }
}
