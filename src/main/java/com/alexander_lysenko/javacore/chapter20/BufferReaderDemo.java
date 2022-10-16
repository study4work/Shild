package main.java.com.alexander_lysenko.javacore.chapter20;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;

public class BufferReaderDemo {
    public static void main(String[] args) {
        String s = "Copyright mark &copy; " + ", &copy - don;t";
        char[] buf = new char[s.length()];
        s.getChars(0, s.length(), buf, 0);
        CharArrayReader in = new CharArrayReader(buf);
        int c;
        boolean marked = false;

        try (BufferedReader f = new BufferedReader(in)) {
            while ((c = f.read()) != -1) {
                switch (c) {
                    case '&' :
                        if(!marked) {
                            f.mark(32);
                            marked = true;
                        } else {
                            marked = false;
                        }
                    case ';' :
                        if(marked) {
                            marked = false;
                            System.out.println("(C)");
                        } else {
                            System.out.println((char) c);
                            break;
                        }
                    case ' ' :
                        if(marked) {
                            marked = false;
                            f.reset();
                            System.out.println("&");
                        } else {
                            System.out.println((char) c);
                            break;
                        }
                    default:
                        if (!marked) {
                            System.out.println((char)c);
                            break;
                        }
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
