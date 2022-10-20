package main.java.com.alexander_lysenko.javacore.chapter28.Locks;

import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
         new LockThread(lock, "A");
         new LockThread(lock, "B");

    }
}
