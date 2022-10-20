package main.java.com.alexander_lysenko.javacore.chapter28;

import java.util.concurrent.Semaphore;

public class Q {
    int n;
    static Semaphore semCon = new Semaphore(0);
    static Semaphore semProd = new Semaphore(1);

    void get() {
        try {
            semCon.acquire();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Recived: " + n);
        semProd.release();
    }

    void put(int n) {
        try {
            semProd.acquire();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        this.n = n;
        System.out.println("Deliver: " + n);
        semCon.release();
    }
}
