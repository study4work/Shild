package main.java.com.alexander_lysenko.javacore.chapter20;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriterDemo {
    public static void main(String[] args) {
        CharArrayWriter f = new CharArrayWriter();
        String s = "This data must be in a array";
        char[] buf = new char[s.length()];

        s.getChars(0, s.length(), buf, 0);

        try {
            f.write(buf);
        } catch (IOException e) {
            System.out.println(e);
            return;
        }

        System.out.print("Buffer in char string");
        System.out.print(f.toString());
        System.out.print("In array");

        char[] c = f.toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }

        System.out.println("OutputStrem FileWriter");

        try (FileWriter f2 = new FileWriter("test1.txt")) {
        f.writeTo(f2);
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println("Install into beggining stage");
        f.reset();

        System.out.println(f.toString());
    }
}
