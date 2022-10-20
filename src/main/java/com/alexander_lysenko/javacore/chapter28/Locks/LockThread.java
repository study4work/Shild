package main.java.com.alexander_lysenko.javacore.chapter28.Locks;

import java.util.concurrent.locks.ReentrantLock;

public class LockThread implements Runnable{
    String name;
    ReentrantLock lock;
    LockThread(ReentrantLock lock, String name) {
        this.lock = lock;
        this.name = name;
        new Thread(this).start();
    }

    public void run() {
        System.out.println("Starting the thread");

        try {
            System.out.println("Thread " + name + " waiting for counter lock");
            lock.lock();
            System.out.println("Thread " + name + " locking counter");
            Shared.count++;
            System.out.println("Thread " + name + ": " + Shared.count);
            System.out.println("Thread " + name + "is waiting");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        } finally {
            System.out.println("Thread " + name + " unlock counter");
            lock.unlock();
        }
    }
}
