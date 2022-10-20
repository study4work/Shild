package main.java.com.alexander_lysenko.javacore.chapter28.BarAction;

public class BarAction implements Runnable {

    @Override
    public void run() {
        System.out.println("Barrier is reached");
    }
}
