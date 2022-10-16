package main.java.com.alexander_lysenko.javacore.chapter20;

import java.io.*;

public class SirializationDemo {
    public static void main(String[] args) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("serial"))) {
        MyClass object1 = new MyClass("Hello", -7, 2.7890);
            System.out.print("Object1: " + object1);

            objectOutputStream.writeObject(object1);
        } catch (IOException e) {
            System.out.println(e);
        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("serial"))) {
            MyClass object2 = (MyClass) objectInputStream.readObject();
            System.out.println("Object2: " + object2);
        } catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }
    }
}
