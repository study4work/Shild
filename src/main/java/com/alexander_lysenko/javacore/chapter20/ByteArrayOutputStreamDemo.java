package main.java.com.alexander_lysenko.javacore.chapter20;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
        ByteArrayOutputStream f = new ByteArrayOutputStream();
        String s = "This data should be inject into array";
        byte[] buf = s.getBytes();

        try {
            f.write(buf);
        } catch (IOException e) {
            System.out.print("Error buffer writer");
            return;
        }

        System.out.print("Buffer in symbol string ");
        System.out.print(f.toString());
        System.out.print("In array ");
        byte[] b = f.toByteArray();
        for (int i = 0; i < b.length; i++) {
            System.out.print((char) b[i]);
            System.out.print("output stream: ");
        }

        // использовать оператор try с ресурсами для управления
        // потокам ввода-ввыода
        try (FileOutputStream f2 = new FileOutputStream("test.txt")) {
            f.writeTo(f2);
        } catch (IOException e) {
            System.out.println("Error inpu-output:" + e);
            return;
        }
        System.out.println("Reset");
        f.reset();

        for (int i = 0; i < 3 ; i++) f.write('X');
        System.out.println(f.toString());
    }
}
