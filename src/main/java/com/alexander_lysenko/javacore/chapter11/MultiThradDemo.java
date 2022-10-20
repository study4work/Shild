package main.java.com.alexander_lysenko.javacore.chapter11;

public class MultiThradDemo {
    public static void main(String[] args) {
        new NewThread("Thread1");
        new NewThread("Thread2");
        new NewThread("Thread3");
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

