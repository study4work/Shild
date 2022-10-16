package main.java.com.alexander_lysenko.javacore.chapter10;

public class Exc1 {
    static void subroutine() {
        int d = 0;
        int a = 10 / d;    //"main" java.lang.ArithmeticException: / by zero
    }

    public static void main(String[] args) {
        Exc1.subroutine();
    }
    //at main.java.com.alexander_lysenko.javacore.chapter10.Exc1.subroutine(Exc1.java:6)
    //	at main.java.com.alexander_lysenko.javacore.chapter10.Exc1.main(Exc1.java:10)
}
