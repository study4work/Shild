package main.java.com.alexander_lysenko.javacore.chapter28.Phaser;

import java.util.concurrent.Phaser;

public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phsr = new Phaser(1);
        int curPhase;
        System.out.println("Starting threads");
        new MyThread(phsr, "A");
        new MyThread(phsr, "B");
        new MyThread(phsr, "C");

        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Fase " + curPhase + " is done");

        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Fase " + curPhase + " is done");

        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Fase " + curPhase + " is done");

        phsr.arriveAndDeregister();

        if (phsr.isTerminated()) {
            System.out.println("Phaser is closed");
        }


    }
}
