package main.java.com.alexander_lysenko.javacore.chapter29;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo7 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("larry", "555-555", "L@.com"));
        myList.add(new NamePhoneEmail("alex", "666-555", "A@.com"));
        myList.add(new NamePhoneEmail("wheel", "777-555", "W@.com"));

        Stream<NamePhone> nAF =  myList.stream().map(a -> new NamePhone(a.name, a.phonenum));

        List<NamePhone> npList = nAF.collect(Collectors.toList());

        npList.stream().forEach(System.out::println);
    }
}
