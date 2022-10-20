package main.java.com.alexander_lysenko.javacore.chapter11.newtrhead;

public class SuspendResume {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("one");
        NewThread ob2 = new NewThread("two");

        try {
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("stop thread one");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("run thread two");
            Thread.sleep(1000);
            ob2.mysuspend();
            System.out.println("stop thread one");
            Thread.sleep(1000);
            ob2.myresume();
            System.out.println("run thread two");

        } catch (InterruptedException e) {
            System.out.println(e);
        }

        try {
            System.out.println("Waiting end of threads");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Main thread is over");
    }
}
