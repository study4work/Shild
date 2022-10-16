package main.java.com.alexander_lysenko.javacore.chapter13;

import java.io.PrintWriter;

//продемонстрировать применение класса printWriter
public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);

        pw.println("это строка");
        int i = -7;
        pw.println(i);
        double d = 4.5 - 7;
        pw.println(d);

    }
}
