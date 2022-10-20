package main.java.com.alexander_lysenko.javacore.chapter28.Callable;

import java.util.concurrent.Callable;

public class Hypot implements Callable<Double> {
    double side1;
    double side2;

    Hypot(double s1, double s2) {
        side1 = s1;
        side2 = s2;
    }

    public Double call() {
        return Math.sqrt((side1*side1) + (side2 * side2));
    }
}
