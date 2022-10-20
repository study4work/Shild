package main.java.com.alexander_lysenko.javacore.chapter28.ForckJoinTask;

import java.util.concurrent.RecursiveAction;

public class Transform extends RecursiveAction {
    int seqThreshold;

    double[] data;

    int start, end;

    Transform(double[] vals, int s, int e, int t){
        data = vals;
        start = s;
        end = e;
        seqThreshold = t;
    }

    protected void compute() {
        if((end - start) < seqThreshold) {
            for (int i = start; i < end; i++) {
                if(data[i] % 2 == 0) {
                    data[i] = Math.sqrt(data[i]);
                } else {
                    data[i] = Math.cbrt(data[i]);
                }
            }
        } else {
            int midlle = (start + end) / 2;

            invokeAll(new Transform(data, start, midlle, seqThreshold),
                    new Transform(data, midlle, end, seqThreshold));
        }
    }
}
