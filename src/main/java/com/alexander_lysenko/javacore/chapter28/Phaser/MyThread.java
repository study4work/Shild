package main.java.com.alexander_lysenko.javacore.chapter28.Phaser;

import java.util.concurrent.Phaser;

class MyThread implements Runnable {
    Phaser phrs;
    String name;

    MyThread(Phaser phrs, String name) {
        this.phrs = phrs;
        this.name = name;
        phrs.register();
        new Thread(this, name).start();
    }

    public void run() {
        System.out.println("Thread " + name + " starting first fase");
        phrs.arriveAndAwaitAdvance();//fase achivment
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Thread " + name + " starting second fase");
        phrs.arriveAndAwaitAdvance();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread " + name + " starting third fase");
        phrs.arriveAndDeregister();

    }


}
