package main.java.com.alexander_lysenko.javacore.chapter11;

public class Caller implements Runnable {
    String msg;
    Callme targer;
    Thread t;

    public Caller(Callme targ, String s) {
        targer = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }
    @Override
    public void run() {
        synchronized (targer) {
            targer.call(msg);
        }
    }
}
