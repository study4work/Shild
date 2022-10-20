package main.java.com.alexander_lysenko.javacore.chapter11;

public class NewThread implements Runnable {
    Thread t;

     NewThread(String name) {
         t = new Thread(this, name);
         System.out.println("Second thread: " + t);
         t.start();
     }

    @Override
    public void run() {
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Charge thread is interrupt");
        }
    }
}
