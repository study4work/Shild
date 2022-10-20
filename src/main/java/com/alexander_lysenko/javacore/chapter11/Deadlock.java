package main.java.com.alexander_lysenko.javacore.chapter11;

public class Deadlock implements Runnable {
    A a = new A();
    B b = new B();

    Deadlock() {
        Thread.currentThread().setName("Main thread");
        Thread t = new Thread(this, "Race thread");
        t.start();
        a.foo(b);
        System.out.println("Back in the main method");
    }

    public void run() {
        b.bar(a);
        System.out.println("Back to another thread");
    }

    public static void main(String[] args) {
        new Deadlock();
    }

}
