package main.java.com.alexander_lysenko.javacore.chapter20.sequenceInputStreamDemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

public class SequenceInputStreamDemo {
    public static void main(String[] args) {
        int c;
        Vector<String> files = new Vector<>();

        files.add("file1.txt");
        files.add("file2.txt");
        files.add("file3.txt");

        InputStreamEnumerator ise = new InputStreamEnumerator(files);
        try (InputStream input = new SequenceInputStream(ise)) {
            while ((c = input.read()) != -1) {
                System.out.print((char) c);
            }
        }catch (IOException e) {
            System.out.println("IO error" + e);
        }
    }
}
