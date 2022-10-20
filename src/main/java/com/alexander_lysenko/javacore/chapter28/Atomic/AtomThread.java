package main.java.com.alexander_lysenko.javacore.chapter28.Atomic;

public class AtomThread implements Runnable {
    String name;

    AtomThread(String name) {
        this.name = name;
        new Thread(this).start();
    }

    public void run() {
        System.out.println("Thread starting " + name);
        for (int i = 1; i < 3; i++) {
            System.out.println("Thread " + name + " recived " + Shared.a.getAndSet(i));
        }
    }
}
