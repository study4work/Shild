package main.java.com.alexander_lysenko.javacore.chapter11;

public class B {
    synchronized void bar(A a) {
    String name = Thread.currentThread().getName();
        System.out.println(name + " in method B.foo()");
        try {
        Thread.sleep(1000);
    } catch (Exception e) {
        System.out.println(e);
    }
        System.out.println(name + "trying to call method A.last()");
        a.last();
}

    synchronized void last() {
        System.out.println("In method B.last()");
    }
}
