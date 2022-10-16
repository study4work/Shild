package main.java.com.alexander_lysenko.javacore.chapter22;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Whois {
    public static void main(String[] args) {
        int c;
        try (Socket socket = new Socket("whois.internic.net", 43)) {


            InputStream in = socket.getInputStream();
            OutputStream ou = socket.getOutputStream();

            String str = (args.length == 0 ? "MHProfessional.com" : args[0]) + "\n";

            byte[] bytes = str.getBytes();

            ou.write(bytes);

            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
