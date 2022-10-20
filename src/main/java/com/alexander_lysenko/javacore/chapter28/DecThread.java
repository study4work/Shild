package main.java.com.alexander_lysenko.javacore.chapter28;

import java.util.concurrent.Semaphore;

public class DecThread implements Runnable {
    String name;
    Semaphore sem;

    DecThread(Semaphore s, String name) {
        sem = s;
        this.name = name;
        new Thread(this).start();
    }

    public void run() {
        System.out.println("Starting thread: " + name);
        try {
            System.out.println("Thread " + name + " waiting permission");
            sem.acquire();
            System.out.println("Thread " + name + "taking permission");

            for(int i = 0; i < 5; i++) {
                Shared.count--;
                System.out.println(name + ": " + Shared.count);

                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread " + name + " free permission");
        sem.release();
    }
    }
