package main.java.com.alexander_lysenko.javacore.chapter28;

public class ProdCon {
    public static void main(String[] args) {
        Q q = new Q();
        new Consumer(q);
        new Producer(q);
    }
}
