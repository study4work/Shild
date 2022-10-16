package main.java.com.alexander_lysenko.javacore.chapter15;

import java.util.ArrayList;
import java.util.Collections;

public class UseMethodRef {
    //метод compare, совместимый с анологичным методом
    //определенным в классе Comporator
    static int compareMc(MyClass a, MyClass b) {
        return a.getVal() - b.getVal();
    }

    public static void main(String[] args) {
        ArrayList<MyClass> al = new ArrayList<>();
        al.add(new MyClass(1));
        al.add(new MyClass(4));
        al.add(new MyClass(3));
        al.add(new MyClass(8));
        al.add(new MyClass(5));
        al.add(new MyClass(9));
        //find max value using compareMc
        MyClass maxValObj = Collections.max(al, UseMethodRef::compareMc);
        System.out.println("Max value is: " + maxValObj.getVal());
    }
}
