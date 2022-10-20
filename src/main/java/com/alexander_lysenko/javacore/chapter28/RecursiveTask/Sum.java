package main.java.com.alexander_lysenko.javacore.chapter28.RecursiveTask;

import java.util.concurrent.RecursiveTask;

public class Sum extends RecursiveTask<Double> {
    final int seqThreshold = 500;
    double[] data;
    int start, end;
    Sum (double[] val, int s, int e) {
        data = val;
        start = s;
        end = e;
    }

    protected Double compute() {
        double sum = 0;
        if((end - start) < seqThreshold) {
            for (int i = start; i < end; i++) {
                sum += data[i];
            }
        } else {
            int middle = (start + end) / 2;
            Sum subTaskA = new Sum(data, start, middle);
            Sum subTaskB = new Sum(data, middle, end);

            subTaskA.fork();
            subTaskB.fork();

            sum = subTaskA.join() + subTaskB.join();
        }
        return sum;
    }
 }
