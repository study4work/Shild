package main.java.com.alexander_lysenko.javacore.chapter20;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) throws IOException {
        String tmp = "abcdefghijklmnopqrstuv";
        byte[] b = tmp.getBytes();

        ByteArrayInputStream inputStream1 = new ByteArrayInputStream(b);
        ByteArrayInputStream inputStream2 = new ByteArrayInputStream(b,0,3);
    }
}
