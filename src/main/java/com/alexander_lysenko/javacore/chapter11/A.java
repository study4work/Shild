package main.java.com.alexander_lysenko.javacore.chapter11;

public class A {
    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " in method A.foo()");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(name + "trying to call method B.last()");
        b.last();
    }

    synchronized void last() {
        System.out.println("In method A.last()");
    }
}
