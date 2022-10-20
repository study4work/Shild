package main.java.com.alexander_lysenko.javacore.chapter28.BarAction;

import java.util.concurrent.CyclicBarrier;

 class MyThread implements Runnable {
    CyclicBarrier cbarl;
    String name;

    MyThread(CyclicBarrier cbarl, String name) {
        this.cbarl = cbarl;
        this.name = name;
        new Thread(this).start();
    }

    public void run() {
        System.out.println(name);
        try {
            cbarl.await();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
