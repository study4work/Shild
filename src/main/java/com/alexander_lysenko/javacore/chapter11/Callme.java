package main.java.com.alexander_lysenko.javacore.chapter11;

public class Callme {
    synchronized void call(String msg) {
        System.out.println("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
