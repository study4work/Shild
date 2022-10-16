package main.java.com.alexander_lysenko.javacore.chapter22;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlDemo {
    public static void main(String[] args) throws MalformedURLException {
        URL hp = new URL("http://www.HerbSchildt.com/Articles");

        System.out.println(hp.getProtocol());
        System.out.println(hp.getPort());
        System.out.println(hp.getHost());
        System.out.println(hp.getFile());
        System.out.println(hp.toExternalForm());
    }
}
