package main.java.com.alexander_lysenko.javacore.chapter28.CountDown;

import java.util.concurrent.CountDownLatch;

public class CDLDemo {
    public static void main(String[] args) {
        CountDownLatch cd1 = new CountDownLatch(5);
        System.out.println("Starting main thread");
        new MyThread(cd1);
        try {
            cd1.await();
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
    }
}
