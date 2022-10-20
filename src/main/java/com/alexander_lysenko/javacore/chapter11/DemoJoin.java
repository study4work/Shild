package main.java.com.alexander_lysenko.javacore.chapter11;

public class DemoJoin {
    public static void main(String[] args) {
        NewThread t1 = new NewThread("Thread1");
        NewThread t2 = new NewThread("Thread2");
        NewThread t3 = new NewThread("Thread3");

        System.out.println("Thread1 is running: " + t1.t.isAlive());
        System.out.println("Thread2 is running: " + t2.t.isAlive());
        System.out.println("Thread3 is running: " + t3.t.isAlive());

        try {
            System.out.println("Waiting for thread ending work");
            t1.t.join();
            t2.t.join();
            t3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread is interrupt");
        }
    }
}
