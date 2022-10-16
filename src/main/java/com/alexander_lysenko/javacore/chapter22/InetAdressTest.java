package main.java.com.alexander_lysenko.javacore.chapter22;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAdressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress Adress = InetAddress.getLocalHost();
        System.out.println(Adress);

//        Adress = InetAddress.getByName("www.HerbSchild.com");
//        System.out.println(Adress);

        InetAddress[] sw = InetAddress.getAllByName("www.nba.com");
        for(int i = 0; i<sw.length; i++) {
            System.out.println(sw[i]);
        }

    }
}
