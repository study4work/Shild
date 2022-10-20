package main.java.com.alexander_lysenko.javacore.chapter11;

public class Consumer implements Runnable {
    Q q;

    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Comsumer").start();
    }

    public void run () {
        while (true) {
            q.get();
        }
    }
}
