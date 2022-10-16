package main.java.com.alexander_lysenko.javacore.chapter20;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        String source = "Now is the time for all good man" + "to come to the aid of their country" + "and pay their due taxes";
        char[] buff = new char[source.length()];
        source.getChars(0, source.length(), buff, 0);
        try (FileWriter f1 = new FileWriter("File11.txt");
             FileWriter f2 = new FileWriter("File22.txt");
             FileWriter f3 = new FileWriter("File3.txt") ) {

            for (int i = 0; i < buff.length; i++) {
                f1.write(buff[i]);
            }

            f2.write(buff);

            f3.write(buff, buff.length - buff.length/4, buff.length/4);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
