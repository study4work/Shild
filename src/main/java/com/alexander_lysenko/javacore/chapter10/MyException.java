package main.java.com.alexander_lysenko.javacore.chapter10;

public class MyException extends Exception {
    private int detail;

    public MyException (int a) {
        detail = a;
    }

    public String toString() {
        return "MyException[" + detail + "]";
    }
}
