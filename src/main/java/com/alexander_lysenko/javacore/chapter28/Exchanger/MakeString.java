package main.java.com.alexander_lysenko.javacore.chapter28.Exchanger;

import java.util.concurrent.Exchanger;

public class MakeString implements Runnable {
    Exchanger<String> ex;
    String str;

    MakeString(Exchanger<String> c) {
        ex = c;
        str = new String();
        new Thread(this).start();
    }

    public void run() {
        char ch = 'A';
        for (int i = 0; i < 3; i++) {
            //fel the buffer
            for (int j = 0; j < 5; j++) {
                str += (char) ch++;
            }
            try {
                str = ex.exchange(str);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
