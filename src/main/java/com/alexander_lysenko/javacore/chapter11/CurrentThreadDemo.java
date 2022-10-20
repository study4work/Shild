package main.java.com.alexander_lysenko.javacore.chapter11;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current thread: " + t);
        t.setName("MyThread");
        System.out.println("Change name thread: " + t);

        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Charge thread is interrupt");
        }

    }
}
