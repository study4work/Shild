package main.java.com.alexander_lysenko.javacore.chapter28.Exchanger;

import java.util.concurrent.Exchanger;

public class UseString implements Runnable {
    Exchanger<String> ex;
    String str;

    UseString(Exchanger<String> c) {
        ex = c;
        new Thread(this).start();
    }

    public void run() {
        for (int i = 0; i<3; i++) {
            try {
                str = ex.exchange(new String());
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
