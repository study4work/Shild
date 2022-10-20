package main.java.com.alexander_lysenko.javacore.chapter28.CountDown;

import java.util.concurrent.CountDownLatch;

class MyThread implements Runnable {
    CountDownLatch latch;

    MyThread(CountDownLatch c) {
        latch = c;
        new Thread(this).start();
    }

    public void run() {
        for (int i = 0;i < 5; i++) {
            System.out.println(i);
            latch.countDown();
        }
    }
}
