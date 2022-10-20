package main.java.com.alexander_lysenko.javacore.chapter28.Callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);

        Future<Double> f2;
        Future<Integer> f3;
        Future<Integer> f;

        System.out.println("Starting");


        f2 = es.submit(new Hypot(3, 4));
        f = es.submit(new Sum(10));
        f3 = es.submit(new Factorial(5));

        try {
            System.out.println(f.get());
            System.out.println(f2.get());
            System.out.println(f3.get());
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
