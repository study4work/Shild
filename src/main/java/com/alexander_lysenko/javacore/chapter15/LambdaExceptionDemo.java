package main.java.com.alexander_lysenko.javacore.chapter15;

public class LambdaExceptionDemo {
    public static void main(String[] args) throws EmptyArrayExceprion {
        double[] values = {1, 2, 3, 4};

        //в этом выражении вычисляется среднее числовых
        //значений типа double в массиве

        DoubleNumericArrayFunc average = n -> {
            double sum = 0;

            if (n.length == 0) throw new EmptyArrayExceprion();

            for (int i = 0; i < n.length; i++) {
                sum += n[i];
            }
            return sum / n.length;
        };
        System.out.println("Average is: " + average.func(values));
        // Generation exception
        System.out.println("Average is: " + average.func(new double[0]));
    }
}
