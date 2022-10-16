package main.java.com.alexander_lysenko.javacore.chapter20;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        int size = 0;
        try(FileInputStream f = new FileInputStream("C:\\projects\\lysenko.com\\src\\main\\java\\com\\alexander_lysenko\\javacore\\chapter20\\FileInputStreamDemo.java")) {
            System.out.println("All availible bytes is: " + (size =f.available()));

            int n = size/40;
            System.out.println("First " + n + " bytes readed from the file by queue by method read()");

            for(int i = 0; i < n; i++) {
                System.out.println((char) f.read());
            }
            System.out.println("Avalible is: " + f.available());
            System.out.println("Reading next " + n + "bytes by method read(b[])");
            byte b[] = new byte[n];
            if(f.read(b) != n) System.out.println("Can'not read " + n + "bytes");
            System.out.println(new String(b, 0, n));
            System.out.println("Still availible: " + f.available());
            System.out.println("Skip half leaving bytes by skip()" + f.skip(size/2));
            System.out.println("Still availible: " + f.available());
            System.out.println("reading" + n/2 + "bites in the end of array");
            if (f.read(b, n/2, n/2) != n/2) System.out.println("Can't read  " + n/2 + "bytes");
            System.out.println(new String(b, 0, b.length));
            System.out.println("Still availible " + f.available());
        } catch (IOException e) {
            System.out.println("input-output error" + e);
        }
    }
}
