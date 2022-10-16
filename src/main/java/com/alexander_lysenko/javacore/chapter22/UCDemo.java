package main.java.com.alexander_lysenko.javacore.chapter22;

import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class UCDemo {
    public static void main(String[] args) throws Exception {
        int c;
        URL hp = new URL("http://www.internic.net");
        URLConnection hpCon = hp.openConnection();

        long d = hpCon.getDate();
        if (d == 0) {
            System.out.println("Data unavailible");
        } else System.out.println("Data: " + new Date(d));
        System.out.println();
    }
}
