package main.java.com.alexander_lysenko.javacore.chapter11;

public class ThreadDemo {
    public static void main(String[] args) {
        new NewThread("Thread");
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println("Main thread " + n);
                Thread.sleep(1010);
            }
        } catch (InterruptedException e) {
            System.out.println("Charge thread is interrupt");
        }

    }
}
